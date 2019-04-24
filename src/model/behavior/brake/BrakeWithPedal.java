package model.behavior.brake;

import model.BrakeBehavior;

/**
 * created by ersya 4/24/2019
 */
public class BrakeWithPedal implements BrakeBehavior{
    @Override
    public void brake() {
        System.out.println("Braking with pedal");
    }
}
