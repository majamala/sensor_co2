package com.yammer;

import javax.validation.constraints.NotNull;

public class SensorRegister {

    @NotNull
    private String name;
    private String location;
    @NotNull
    private String IPAddress;
    private String description;
    private String unit;
    private String meta;

    public SensorRegister(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public SensorRegister(String name, String location, String IPAddress, String description, String unit, String meta) {
        this.name=name;
        this.location=location;
        this.IPAddress = IPAddress;
        this.description=description;
        this.unit=unit;
        this.meta=meta;
    }

    @Override
    public String toString() {
        return "SensorRegister{" +
                "name=" + name +
                ", location='" + location + '\'' +
                ", IPAddress='" + IPAddress + '\'' +
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

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
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