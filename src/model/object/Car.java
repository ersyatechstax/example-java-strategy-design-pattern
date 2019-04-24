package model.object;

import model.Vehicle;
import model.behavior.accelerate.AccelerateWithWheels;
import model.behavior.brake.BrakeWithPedal;

/**
 * created by ersya 4/24/2019
 */
public class Car extends Vehicle{
    public Car(String name){
        this.name = name;
        accelerateBehavior = new AccelerateWithWheels(4);
        brakeBehavior = new BrakeWithPedal();
    }

    public Car(){
        accelerateBehavior = new AccelerateWithWheels(4);
        brakeBehavior = new BrakeWithPedal();
    }

    @Override
    public void altBrake() {
        System.out.println("No alternative brake");
    }
}
