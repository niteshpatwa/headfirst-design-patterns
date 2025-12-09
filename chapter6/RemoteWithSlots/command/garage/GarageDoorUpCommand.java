package RemoteWithSlots.command.garage;

import RemoteWithSlots.command.Command;
import RemoteWithSlots.receiver.GarageDoor;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
