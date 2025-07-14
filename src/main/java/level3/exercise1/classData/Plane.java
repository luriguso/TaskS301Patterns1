package level3.exercise1.classData;

public class Plane extends Vehicle{

    public Plane(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn(){
        System.out.println("the plane is started");
    }

    @Override
    public void turnOff() {
        System.out.println("the plane is stopped");
    }

    @Override
    public void pressAccelerator(){
        System.out.println("the plane is accelerating");
    }

    @Override
    public void releaseAccelerator() {
        System.out.println("the accelerator is releasing");
    }

    @Override
    public void pressBrake(){
        System.out.println("the plane is braking");
    }

    @Override
    public void releaseBrake() {
        System.out.println("the break is stopped");
    }
}
