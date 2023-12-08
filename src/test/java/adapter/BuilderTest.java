package adapter;

import org.example.builder.CarBuilder;
import org.example.builder.CarType;
import org.example.builder.Director;
import org.example.builder.Engine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuilderTest {

    private CarBuilder carBuilder;

    private Engine engine;

    @BeforeEach
    public void init() {
        carBuilder = new CarBuilder();
        engine = new Engine(10D, 10D);
    }

    @Test
    public void shouldConstructSportsCar() {
        Director.constructSportsCar(carBuilder);

        assertEquals(CarType.SPORTS_CAR, carBuilder.getResult().getCarType());
    }


    @Test
    public void shouldConstructCityCar() {
        Director.constructCityCar(carBuilder);

        assertEquals(CarType.CITY_CAR, carBuilder.getResult().getCarType());
    }

    @Test
    public void shouldConstructSUVCar() {
        Director.constructSUV(carBuilder);

        assertEquals(CarType.SUV, carBuilder.getResult().getCarType());
    }

    @Test
    public void shouldGo() {
        engine.on();
        engine.go(10D);

        assertTrue(engine.isStarted());
        assertEquals(20D, engine.getMileage());
    }
}