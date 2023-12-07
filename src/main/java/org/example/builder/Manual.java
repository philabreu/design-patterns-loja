package org.example.builder;

import lombok.Getter;

import static java.util.Objects.nonNull;

public record Manual(@Getter CarType carType, @Getter int seats,
                     @Getter Engine engine, @Getter Transmission transmission,
                     @Getter TripComputer tripcomputer, @Getter GPSNavigator gps) {

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
