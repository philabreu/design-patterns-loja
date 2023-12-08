package org.example.builder;

import lombok.Setter;

public class TripComputer {
    @Setter
    private Car car;

    public void showFuelLevel() {
        System.out.println("combustível: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("car ligado");
        } else {
            System.out.println("carro não ligou");
        }
    }
}