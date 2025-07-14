package level3.exercise1.main;

import level3.exercise1.classManagement.ParkingManagement;

public class Main {
    public static void main(String[] args) {
        ParkingManagement parking = ParkingManagement.getInstance();
        parking.addVehicleExample();
        parking.accelerateVehicle();
    }
}
