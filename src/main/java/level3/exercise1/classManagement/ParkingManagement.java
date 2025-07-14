package level3.exercise1.classManagement;

import level3.exercise1.classData.*;
import level3.exercise1.interfaces.Command;

public class ParkingManagement {
    private Parking parking = new Parking();
    private static ParkingManagement instance;
    CommandAction commandAction = new CommandAction();

    public static ParkingManagement getInstance() {
        if (instance == null) {
            instance = new ParkingManagement();
        }
        return instance;
    }

    private ParkingManagement() {

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
        System.out.println("Turn on Vehicle");
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
        System.out.println("brake Vehicle");
        System.out.println(parking.getVehicles().size());
        for (Vehicle vehicle : parking.getVehicles()) {
            Command brake = new BrakeVehicleCommand(vehicle);
            commandAction.setCommand(brake);
            commandAction.execute();
            commandAction.undo();
        }
    }
}
