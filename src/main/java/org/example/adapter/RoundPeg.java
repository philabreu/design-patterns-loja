package org.example.adapter;

import lombok.Getter;

public class RoundPeg {
    @Getter
    private double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public RoundPeg() {
    }
}
