package model.object;

import model.Vehicle;
import model.behavior.accelerate.AccelerateWithWings;
import model.behavior.brake.BrakeWithPedal;
import model.behavior.brake.BrakeWithWingTips;

/**
 * created by ersya 4/24/2019
 */
public class Aeroplane extends Vehicle {
    public Aeroplane(String name){
        this.name = name;
        this.brakeBehavior = new BrakeWithPedal();
        this.altBrakeBehavior = new BrakeWithWingTips();
    }

    public Aeroplane(){
        this.brakeBehavior = new BrakeWithPedal();
        this.altBrakeBehavior = new BrakeWithWingTips();
    }

    @Override
    public void altBrake() {
        altBrakeBehavior.brake();
    }
}
