package IgorKupchack.Bank.lesson5;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void movingTest() throws Exception {
        Car cr = new Car("BMW");
        cr.turbo();
        cr.setEngine(new Engine(1.5));
        System.out.println("Car engine volume is: "+cr.getEngine().getVolume());
    }
}