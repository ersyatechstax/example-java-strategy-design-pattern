package model.object;

import model.Vehicle;
import model.behavior.accelerate.AccelerateWithWheels;
import model.behavior.brake.BrakeWithLever;

/**
 * created by ersya 4/24/2019
 */
public class Motorcycle extends Vehicle {
    public Motorcycle(String name, Integer wheels){
        this.name = name;
        //motorcycle with custom number of wheels like 3,4,etc
        this.accelerateBehavior = new AccelerateWithWheels(wheels);
        this.brakeBehavior = new BrakeWithLever();
    }

    public Motorcycle(){
        this.brakeBehavior = new BrakeWithLever();
    }

    @Override
    public void altBrake() {
        altBrakeBehavior.brake();
    }
}
