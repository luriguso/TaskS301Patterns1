package level3.exercise1.classData;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Vehicle> vehicles;

    public Parking() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void showVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
