package model;

/**
 * created by ersya 4/24/2019
 */
public abstract class Vehicle {
    protected String name;

    protected AccelerateBehavior accelerateBehavior;

    protected BrakeBehavior brakeBehavior;

    protected BrakeBehavior altBrakeBehavior;

    public void setAccelerateBehavior(AccelerateBehavior accelerateBehavior) {
        this.accelerateBehavior = accelerateBehavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(){ }

    protected Vehicle(String name, AccelerateBehavior accelerateBehavior, BrakeBehavior brakeBehavior) {
        this.name = name;
        this.accelerateBehavior = accelerateBehavior;
        this.brakeBehavior = brakeBehavior;
    }

    public void accelerate(){
        accelerateBehavior.accelerate();
    }

    public void brake(){
        brakeBehavior.brake();
    }

    //alternative brake
    public abstract void altBrake();

}
