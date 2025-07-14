package level3.exercise1.classManagement;

import level3.exercise1.interfaces.Command;

public class CommandAction {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }

    public void undo() {
        command.undo();
    }
}
