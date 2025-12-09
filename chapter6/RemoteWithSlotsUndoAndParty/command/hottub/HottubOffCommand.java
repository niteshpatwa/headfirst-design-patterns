package RemoteWithSlotsUndoAndParty.command.hottub;

import RemoteWithSlotsUndoAndParty.command.Command;
import RemoteWithSlotsUndoAndParty.receiver.Hottub;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }

    public void undo() {
        hottub.setTemperature(104);
        hottub.on();
    }
}
