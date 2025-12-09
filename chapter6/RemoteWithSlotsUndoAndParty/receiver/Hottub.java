package RemoteWithSlotsUndoAndParty.receiver;

public class Hottub {
    String location;
    int temperature;

    public Hottub(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Hottub is being heated to a steaming " + temperature + " degrees");
    }

    public void off() {
        System.out.println(location + " Hottub is off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(location + " Hottub temperature set to " + temperature + " degrees");
    }

    public void circulate() {
        System.out.println(location + " Hottub is circulating water");
    }
}
