package adapter;

import org.example.adapter.RoundHole;
import org.example.adapter.RoundPeg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdapterTest {

    @Test
    public void shouldFitRoundRole() {
        RoundHole roundHole = new RoundHole(2.00);

        assertTrue(roundHole.fits(new RoundPeg(2.00)));
    }
}
