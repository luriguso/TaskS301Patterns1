package level3.exercise1.classManagement;

import level3.exercise1.classData.*;
import level3.exercise1.interfaces.Command;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ParkingManagment {
    private Parking parking = new Parking();
    private static ParkingManagment instance;
    CommandAction commandAction = new CommandAction();

    public static ParkingManagment getInstance() {
        if (instance == null) {
            instance = new ParkingManagment();
        }
        return instance;
    }

    private ParkingManagment() {

    }

    public void addVehicleExample(){
        Car car = new Car("Toyota", "Marino");
        Bicycle bicycle = new Bicycle("Trek", "Domane SL 6");
        Plane plane = new Plane("Boeing", "737-800");
        Ship ship = new Ship("Yamaha", "242X E-Series");
        parking.addVehicle(car);
        parking.addVehicle(bicycle);
        parking.addVehicle(plane);
        parking.addVehicle(ship);
    }

    public void turnOnVehicle(){
        System.out.println("Accelerate Vehicle");
        System.out.println(parking.getVehicles().size());
        for (Vehicle vehicle : parking.getVehicles()) {
            Command turnOn = new StartVehicleCommand(vehicle);
            commandAction.setCommand(turnOn);
            commandAction.execute();
            commandAction.undo();
        }
    }

    public void accelerateVehicle(){
        System.out.println("Accelerate Vehicle");
        System.out.println(parking.getVehicles().size());
        for (Vehicle vehicle : parking.getVehicles()) {
            Command accelerate = new AccelerateVehicleCommand(vehicle);
            commandAction.setCommand(accelerate);
            commandAction.execute();
            commandAction.undo();

            Command brake = new BrakeVehicleCommand(vehicle);
            commandAction.setCommand(brake);
            commandAction.execute();
            commandAction.undo();
        }
    }

    public void brakeVehicle(){
        System.out.println("Accelerate Vehicle");
        System.out.println(parking.getVehicles().size());
        for (Vehicle vehicle : parking.getVehicles()) {
            Command brake = new BrakeVehicleCommand(vehicle);
            commandAction.setCommand(brake);
            commandAction.execute();
            commandAction.undo();
        }
    }
}
