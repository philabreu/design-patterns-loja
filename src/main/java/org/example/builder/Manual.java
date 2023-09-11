package org.example.builder;

import lombok.Getter;

import static java.util.Objects.nonNull;

public class Manual {
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

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripcomputer,
                  GPSNavigator gps) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripcomputer = tripcomputer;
        this.gps = gps;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";

        if (nonNull(this.tripcomputer)) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }

        if (nonNull(this.gps)) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }

        return info;
    }
}
