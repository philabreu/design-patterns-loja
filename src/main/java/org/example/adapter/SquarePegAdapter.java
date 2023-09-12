package org.example.adapter;

/**
 * O adaptador permite encaixar pinos quadrados em orifícios redondos.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calcula um raio mínimo do círculo, que pode caber neste pino.
        result = (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));

        return result;
    }
}
