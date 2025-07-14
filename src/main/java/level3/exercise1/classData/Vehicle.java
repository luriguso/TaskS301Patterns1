package level3.exercise1.classData;

public abstract class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void pressAccelerator();
    public abstract void releaseAccelerator();
    public abstract void pressBrake();
    public abstract void releaseBrake();

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
