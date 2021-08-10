package CommandPattern.Example;

public class ACOffCommand implements Command{
    AirConditioner airConditioner;
    int prevSpeed;

    public ACOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public void execute() {
        prevSpeed = airConditioner.getSpeed();
        airConditioner.off();
    }

    public void undo() {
        if (prevSpeed == AirConditioner.HIGH) {
            airConditioner.high();
        } else if (prevSpeed == AirConditioner.MEDIUM) {
            airConditioner.medium();
        } else if (prevSpeed == AirConditioner.LOW) {
            airConditioner.low();
        } else if (prevSpeed == AirConditioner.OFF) {
            airConditioner.off();
        }
    }
}
