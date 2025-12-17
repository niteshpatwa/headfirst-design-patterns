package RemoteWithSlots.command.light;

import RemoteWithSlots.command.Command;
import RemoteWithSlots.receiver.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
