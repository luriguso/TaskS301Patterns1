package level3.exercise1.classData;

public class Bicycle extends Vehicle {
    public Bicycle(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn(){
        System.out.println("the bicycle is started");
    }

    @Override
    public void turnOff() {
        System.out.println("the bicycle is stopped");
    }

    @Override
    public void pressAccelerator(){
        System.out.println("the bicycle is accelerating");
    }

    @Override
    public void releaseAccelerator() {
        System.out.println("the accelerator is releasing");
    }

    @Override
    public void pressBrake(){
        System.out.println("the bicycle is braking");
    }

    @Override
    public void releaseBrake() {
        System.out.println("the brake is releasing");
    }
}
