package level3.exercise1.main;

import level3.exercise1.classManagement.ParkingManagment;

public class Main {
    public static void main(String[] args) {
        ParkingManagment parking = ParkingManagment.getInstance();
        parking.addVehicleExample();
        parking.accelerateVehicle();
    }
}
