package main;

import model.behavior.accelerate.AccelerateWithWheels;
import model.behavior.accelerate.AccelerateWithWings;
import model.object.Aeroplane;
import model.object.Car;
import model.object.Motorcycle;


/**
 * created by ersya 4/24/2019
 */
public class Application {
    public static void main(String[] args){
        System.out.println("Car: ");
        runCar("Mini Coupe");
        runCar("Ford Holden");
        System.out.println();

        System.out.println("Motorcycle: ");
        runMotorcycle("Triumph Bonneville",2);
        runMotorcycle("Jialing Garbage Motorcycle",3);

        System.out.println("Aeroplane: ");
        runAeroplane("Blackbird Aircraft");

    }

    private static void runCar(String name){
        Car car = new Car(name);
        System.out.print(car.getName()+" ");
        car.accelerate();
        System.out.print(car.getName()+" ");
        car.brake();
    }

    private static void runMotorcycle(String name, Integer wheels){
        Motorcycle motorcycle = new Motorcycle(name,wheels);
        System.out.print(motorcycle.getName()+" ");
        motorcycle.accelerate();
        System.out.print(motorcycle.getName()+" ");
        motorcycle.brake();

    }

    private static void runAeroplane(String name){
        Aeroplane aeroplane = new Aeroplane(name);
        //Take-off
        aeroplane.setAccelerateBehavior(new AccelerateWithWheels(2));
        System.out.print("Taking off - ");
        aeroplane.accelerate();
        System.out.println("Pulling off the wheels");
        aeroplane.setAccelerateBehavior(new AccelerateWithWings());
        System.out.print("Flying - ");
        aeroplane.accelerate();
        System.out.println("Prepare for landing");
        aeroplane.altBrake();
        aeroplane.brake();
        System.out.println(aeroplane.getName() + "has landed successfully");
    }

}
