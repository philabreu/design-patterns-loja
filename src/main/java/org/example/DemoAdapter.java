package org.example;

import org.example.adapter.RoundHole;
import org.example.adapter.RoundPeg;
import org.example.adapter.SquarePeg;
import org.example.adapter.SquarePegAdapter;

public class DemoAdapter {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (roundHole.fits(roundPeg)) {
            System.out.println("round peg r5 fits round hole r5.");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        if (roundHole.fits(smallSquarePegAdapter)) {
            System.out.println("square peg w2 fits round hole r5.");
        }
        if (!roundHole.fits(largeSquarePegAdapter)) {
            System.out.println("square peg w20 does not fit into round hole r5.");
        }
    }
}
