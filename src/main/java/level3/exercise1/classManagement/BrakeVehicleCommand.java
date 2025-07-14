package level3.exercise1.classManagement;

import level3.exercise1.classData.Vehicle;
import level3.exercise1.interfaces.Command;

public class BrakeVehicleCommand implements Command {
    private Vehicle vehicle;

    public BrakeVehicleCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.pressBrake();
    }

    @Override
    public void undo() {
        vehicle.releaseBrake();
    }
}
