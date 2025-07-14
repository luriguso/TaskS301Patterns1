package level3.exercise1.classData;

public class Ship extends Vehicle{

    public Ship(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn(){
        System.out.println("the ship is started");
    }

    @Override
    public void turnOff() {
        System.out.println("the ship is stopped");
    }

    @Override
    public void pressAccelerator(){
        System.out.println("the ship is accelerating");
    }

    @Override
    public void releaseAccelerator() {
        System.out.println("the accelerator is releasing");
    }

    @Override
    public void pressBrake(){
        System.out.println("the ship is braking");
    }

    @Override
    public void releaseBrake() {
        System.out.println("the brake is releasing");
    }
}
