package org.example.adapter;

import lombok.Getter;

/**
 * SquarePegs não são compatíveis com RoundHoles (eles foram implementados pela equipe de desenvolvimento anterior).
 * Mas temos que integrá-los em nosso programa.
 */
public class SquarePeg {
    @Getter
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }
}