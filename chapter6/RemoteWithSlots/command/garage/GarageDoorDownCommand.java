package RemoteWithSlots.command.garage;

import RemoteWithSlots.command.Command;
import RemoteWithSlots.receiver.GarageDoor;

public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }
}
