package model.behavior.accelerate;

import model.AccelerateBehavior;

/**
 * created by ersya 4/24/2019
 */
public class AccelerateWithWheels implements AccelerateBehavior {

    @Override
    public void accelerate() {
        System.out.println("Accelerating with "+ wheels +" wheels");
    }

    private Integer wheels;

    public AccelerateWithWheels(Integer wheels){
        this.wheels = wheels;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }
}
