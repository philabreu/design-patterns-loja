package org.example.builder;

import lombok.Setter;

public class CarBuilder implements Builder {
    @Setter
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripcomputer;
    private GPSNavigator gps;

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripcomputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gps) {
        this.gps = gps;
    }

    public Car getResult(){
        return new Car(carType, seats, engine, transmission, tripcomputer, gps);
    }
}
