package RemoteWithSlotsAndUndo;

import RemoteWithSlotsAndUndo.command.ceilingFan.CeilingFanOffCommand;
import RemoteWithSlotsAndUndo.command.ceilingFan.CeilingFanHighCommand;
import RemoteWithSlotsAndUndo.command.ceilingFan.CeilingFanMediumCommand;
import RemoteWithSlotsAndUndo.command.light.LightOffCommand;
import RemoteWithSlotsAndUndo.command.light.LightOnCommand;
import RemoteWithSlotsAndUndo.invoker.RemoteControlWithUndo;
import RemoteWithSlotsAndUndo.receiver.CeilingFan;
import RemoteWithSlotsAndUndo.receiver.Light;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
