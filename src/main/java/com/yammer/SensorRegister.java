package com.yammer;

import javax.validation.constraints.NotNull;

public class SensorRegister {

    @NotNull
    private String name;
    private String location;
    @NotNull
    private String IPAdress;
    private String description;
    private String unit;
    private String meta;

    public SensorRegister(String IPAddress) {
        this.IPAdress = IPAddress;
    }

    public SensorRegister(String name, String location, String IPAdress, String description, String unit, String meta) {
        this.name=name;
        this.location=location;
        this.IPAdress = IPAdress;
        this.description=description;
        this.unit=unit;
        this.meta=meta;
    }

    @Override
    public String toString() {
        return "SensorRegister{" +
                "name=" + name +
                ", location='" + location + '\'' +
                ", IPAdress='" + IPAdress + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", meta='" + meta + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIPAdress() {
        return IPAdress;
    }

    public void setIPAdress(String IPAdress) {
        this.IPAdress = IPAdress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }
}