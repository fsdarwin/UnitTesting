package com.example.unittesting;

public class MotorVehicle {

    private String engine;
    private String axles;
    private String transmission;

    public MotorVehicle() {
    }

    public MotorVehicle(String engine, String axles, String transmission) {
        this.engine = engine;
        this.axles = axles;
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getAxles() {
        return axles;
    }

    public void setAxles(String axles) {
        this.axles = axles;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
