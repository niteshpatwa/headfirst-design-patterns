package RemoteWithSlotsUndoAndParty.receiver;

public class Stereo {
    String location;
    int volume;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Stereo is On");
    }

    public void off() {
        System.out.println(location + " Stereo is Off");
    }

    public void setCD() {
        System.out.println(location + " Stereo is set to CD input");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + " Stereo volume set to " + volume);
    }
}
