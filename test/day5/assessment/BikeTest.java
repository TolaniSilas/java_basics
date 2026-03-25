package day5.assessment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BikeTest {

    @Test
    public void bikeShouldBeTurnOn() {
        Bike bike = new Bike();
        bike.turnOn();
        
        assertTrue(bike.isOn());
    }

    @Test
    public void bikeShouldBeTurnOff() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.turnOff();

        assertFalse(bike.isOn());
    }

    @Test
    public void bikeShouldAccelerateByOneOnGearOne() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.accelerate(); 
        
        assertEquals(1, bike.getSpeed());
    }

    @Test
    public void bikeShouldAccelerateByTwoOnGearTwo() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.setSpeed(24);
        bike.accelerate();

        assertEquals(26, bike.getSpeed());
    }

    @Test
    public void bikeShouldAccelerateByThreeOnGearThree() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.setSpeed(35);
        bike.accelerate();

        assertEquals(38, bike.getSpeed());
    }








}

