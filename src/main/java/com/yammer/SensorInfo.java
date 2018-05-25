package com.yammer;

public class SensorInfo {

    private String name;
    private String location;
    private String ipAddr;
    private String port;
    private String description;
    private String unit;
    private String meta;

    public SensorInfo(String name, String location, String IPAdress, String port, String description, String unit, String meta) {
        this.name=name;
        this.location=location;
        this.ipAddr = IPAdress;
        this.port = port;
        this.description=description;
        this.unit=unit;
        this.meta=meta;
    }

    @Override
    public String toString() {
        return "SensorInfo{" +
                "name=" + name +
                ", location='" + location + '\'' +
                ", IPAdress='" + ipAddr + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", meta='" + meta + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
