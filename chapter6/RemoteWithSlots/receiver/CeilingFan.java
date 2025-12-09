package RemoteWithSlots.receiver;

public class CeilingFan {
    private String location;
    private static final int HIGH = 3;
    private static final int MEDIUM = 2;
    private static final int LOW = 1;
    private static final int OFF = 0;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {
        this.speed = HIGH;
        System.out.println(location + " ceiling fan is on High");
    }

    public void medium() {
        this.speed = MEDIUM;
        System.out.println(location + " ceiling fan is on Medium");
    }

    public void low() {
        this.speed = LOW;
        System.out.println(location + " ceiling fan is on Low");
    }

    public void off() {
        this.speed = OFF;
        System.out.println(location + " ceiling fan is Off");
    }

    public int getSpeed() {
        return speed;
    }
}
