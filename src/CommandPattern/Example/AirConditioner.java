package CommandPattern.Example;

public class AirConditioner {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public AirConditioner(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("Speed is HIGH");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Speed is MEDIUM");
    }

    public void low() {
        speed = LOW;
        System.out.println("Speed is LOW");
    }

    public void off() {
        speed = OFF;
        System.out.println("AC is OFF");
    }

    public int getSpeed() {
        return speed;
    }
}
