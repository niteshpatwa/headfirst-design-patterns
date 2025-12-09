package RemoteWithSlotsUndoAndParty;

import RemoteWithSlotsUndoAndParty.receiver.Stereo;
import RemoteWithSlotsUndoAndParty.command.Command;
import RemoteWithSlotsUndoAndParty.command.MacroCommand;
import RemoteWithSlotsUndoAndParty.command.hottub.HottubOffCommand;
import RemoteWithSlotsUndoAndParty.command.hottub.HottubOnCommand;
import RemoteWithSlotsUndoAndParty.command.light.LightOffCommand;
import RemoteWithSlotsUndoAndParty.command.light.LightOnCommand;
import RemoteWithSlotsUndoAndParty.command.stereo.StereoOffCommand;
import RemoteWithSlotsUndoAndParty.command.stereo.StereoOnCommand;
import RemoteWithSlotsUndoAndParty.command.tv.TVOffCommand;
import RemoteWithSlotsUndoAndParty.command.tv.TVOnCommand;
import RemoteWithSlotsUndoAndParty.invoker.RemoteControlWithUndoAndParty;
import RemoteWithSlotsUndoAndParty.receiver.Hottub;
import RemoteWithSlotsUndoAndParty.receiver.Light;
import RemoteWithSlotsUndoAndParty.receiver.TV;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndoAndParty remoteControl = new RemoteControlWithUndoAndParty();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub("Living Room");

        LightOnCommand lightOn = new LightOnCommand(light);
        TVOnCommand tvOn = new TVOnCommand(tv);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        TVOffCommand tvOff = new TVOffCommand(tv);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn };
        Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }
}
