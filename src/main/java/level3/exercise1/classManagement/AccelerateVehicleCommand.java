package level3.exercise1.classManagement;

import level3.exercise1.classData.Vehicle;
import level3.exercise1.interfaces.Command;

public class AccelerateVehicleCommand implements Command {
    private Vehicle vehicle;

    public AccelerateVehicleCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.pressAccelerator();
    }

    @Override
    public void undo() {
        vehicle.releaseAccelerator();
    }
}
