package com.yammer;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Sensor {

    @NotNull
    private int id;
    @NotBlank
    private String name;
    @NotBlank
    private String date;
    @NotBlank
    private int value;
    @NotBlank
    private String unit;

    public Sensor() {
    }

    public Sensor(int id, String name, String date, int value, String unit) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.value = value;
        this.unit = unit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Sensor [id=" + id + ", name=" + name + ", date="
                + date + ", value=" + value + ", unit=" + unit + "]";
    }
}