package RemoteWithSlotsUndoAndParty.command.hottub;

import RemoteWithSlotsUndoAndParty.command.Command;
import RemoteWithSlotsUndoAndParty.receiver.Hottub;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.setTemperature(104);
        hottub.on();
    }

    public void undo() {
        hottub.setTemperature(98);
        hottub.off();
    }
}
