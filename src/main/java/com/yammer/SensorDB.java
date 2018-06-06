package com.yammer;

import com.google.gson.Gson;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.setup.Environment;
import org.glassfish.jersey.client.ClientProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SensorDB{
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    Environment environment;

    public SensorDB(Environment environment) {
        this.environment = environment;
    }

    public static void runCO2Sensor(Environment environment) throws InterruptedException{

        Config cfg = new Config();
        final Client client = new JerseyClientBuilder(environment).build("SensorRESTClient");
        client.property(ClientProperties.READ_TIMEOUT, 10000);
        Gson gson = new Gson();

        SensorInfo sensorInfo = new SensorInfo(cfg.getProperty("name"),cfg.getProperty("location"),App.ip.getHostAddress(), cfg.getProperty("port"), cfg.getProperty("description"),cfg.getProperty("unit"), cfg.getProperty("meta"));
        WebTarget webTarget = client.target ("http://localhost:8080/api/sensors");
        Response response = webTarget.request().post(Entity.json(sensorInfo));

        LOGGER.info(response.getStatusInfo().toString());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        Random r = new Random();
        int rangeMin = 250;
        int rangeMax = 2000;


        while (true) {

            long now = System.currentTimeMillis();
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            int randomValue = r.nextInt((rangeMax - rangeMin) + 1) + rangeMin;

            SensorReading sensorReading = new SensorReading("sensor_co2", format.format(now), randomValue, "ppm");


            webTarget = client.target ("http://localhost:8080/api/sensorReadings/sensor_co2");
            response = webTarget.request().post(Entity.json(sensorReading));

            Thread.sleep(7000);
        }
    }
}