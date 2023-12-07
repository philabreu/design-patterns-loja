package adapter;

import org.example.adapter.RoundHole;
import org.example.adapter.RoundPeg;
import org.example.adapter.SquarePegAdapter;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AdapterTest {

    private SquarePegAdapter squarePegAdapter;

    @Test
    public void shouldFitRoundRole() {
        RoundHole roundHole = new RoundHole(2.00);

        assertTrue(roundHole.fits(new RoundPeg(2.00)));
    }
}
