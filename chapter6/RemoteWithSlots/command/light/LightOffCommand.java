package RemoteWithSlots.command.light;

import RemoteWithSlots.command.Command;
import RemoteWithSlots.receiver.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
