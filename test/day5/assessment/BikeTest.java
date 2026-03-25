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

    @Test
    public void bikeShouldAccelerateByFourOnGearFour() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.setSpeed(44);
        bike.accelerate();

        assertEquals(48, bike.getSpeed());
    }

    @Test
    public void bikeShouldDecelerateByOneOnGearOne() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.setSpeed(15);
        bike.decelerate(); 

        assertEquals(14, bike.getSpeed());
    }

    @Test
    public void bikeShouldDecelerateByTwoOnGearTwo() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.setSpeed(24);
        bike.decelerate(); 

        assertEquals(22, bike.getSpeed());
    }

    @Test
    public void bikeShouldDecelerateByThreeOnGearThree() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.setSpeed(35);
        bike.decelerate(); 

        assertEquals(32, bike.getSpeed());
    }

    @Test
    public void bikeShouldDecelerateByFourOnGearFour() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.setSpeed(44);
        bike.decelerate();

        assertEquals(40, bike.getSpeed());
    }

    @Test
    public void bikeShouldNotAccelerateWhenOff() {
        Bike bike = new Bike();
        bike.accelerate();

        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeShouldNotDecelerateWhenOff() {
        Bike bike = new Bike();
        bike.setSpeed(10);
        bike.decelerate();
        
        assertEquals(10, bike.getSpeed());
    }






}


