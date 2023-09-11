package org.example.builder;

import lombok.Getter;

public class Engine {
    @Getter
    private final double volume;

    @Getter
    private double mileage;

    @Getter
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.out.println("cannot go(), you must start engine first");
        }
    }
}
