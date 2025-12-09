package RemoteWithSlotsUndoAndParty.command.tv;

import RemoteWithSlotsUndoAndParty.command.Command;
import RemoteWithSlotsUndoAndParty.receiver.TV;

public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.off();
    }

    public void undo() {
        tv.on();
        tv.setInputChannel();
    }
}
