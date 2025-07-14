package level3.exercise1.classManagement;

import level3.exercise1.classData.Vehicle;
import level3.exercise1.interfaces.Command;

public class StartVehicleCommand implements Command {
    private Vehicle vehicle;

    public StartVehicleCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.turnOn();
    }

    @Override
    public void undo() {
        vehicle.turnOff();
    }
}
