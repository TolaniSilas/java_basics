package day5.assessment;


public class Bike {
    private boolean isOn;
    private int speed;
    private int gearIncrement;

    public void turnOn() {
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getSpeed() {
        return speed;
    }

    private int getGear() {
        
        if (speed <= 20) {
            gearIncrement = 1;

            return gearIncrement;
        }

        else if (speed <= 30) {
            gearIncrement = 2;

            return gearIncrement;
        }

        else if (speed <= 40) {
            gearIncrement = 3;

            return gearIncrement;
        }

        else {
            gearIncrement = 4;
            
            return gearIncrement;
        }

    }

    public void accelerate() {
        speed += getGear();
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void decelerate() {
    speed -= getGear();
    }

    
    
    
    







    
}
