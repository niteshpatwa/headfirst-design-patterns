package RemoteWithSlotsUndoAndParty.command.stereo;

import RemoteWithSlotsUndoAndParty.command.Command;
import RemoteWithSlotsUndoAndParty.receiver.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
    }
}
