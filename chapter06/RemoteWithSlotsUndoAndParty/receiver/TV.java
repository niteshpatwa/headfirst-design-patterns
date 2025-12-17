package RemoteWithSlotsUndoAndParty.receiver;

public class TV {
    String location;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV is On");
    }

    public void off() {
        System.out.println(location + " TV is Off");
    }

    public void setInputChannel() {
        System.out.println(location + " TV channel is set to DVD");
    }

    public void setVolume(int volume) {
        System.out.println(location + " TV volume set to " + volume);
    }
}
