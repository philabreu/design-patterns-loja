package org.example.adapter;

import lombok.Getter;

public class RoundHole {
    @Getter
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return (this.getRadius() >= roundPeg.getRadius());
    }
}
