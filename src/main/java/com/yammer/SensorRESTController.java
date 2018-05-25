package com.yammer;

import javax.validation.Validator;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("/sensors")
@Produces(MediaType.APPLICATION_JSON)
public class SensorRESTController {

    private final Validator validator;

    public SensorRESTController(Validator validator) {
        this.validator = validator;


    }

    @POST
    @Path("/sensorTemp")
    public Response getSensorTempReadings() {
        return Response.ok(SensorDB.getSensorTemp()).build();

    }

}