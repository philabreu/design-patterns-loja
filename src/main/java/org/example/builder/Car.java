package org.example.builder;

import lombok.Getter;

import static java.util.Objects.nonNull;

public class Car {
    @Getter
    private final CarType carType;

    @Getter
    private final int seats;

    @Getter
    private final Engine engine;

    @Getter
    private final Transmission transmission;

    @Getter
    private final TripComputer tripcomputer;

    @Getter
    private final GPSNavigator gps;

    @Getter
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripcomputer,
               GPSNavigator gps) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripcomputer = tripcomputer;
        if (nonNull(this.tripcomputer)){
            this.tripcomputer.setCar(this);
        }
        this.gps = gps;
    }

}