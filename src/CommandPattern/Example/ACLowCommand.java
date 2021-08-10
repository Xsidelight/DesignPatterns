package CommandPattern.Example;

public class ACLowCommand implements Command{
    AirConditioner airConditioner;
    int previousSpeed;

    public ACLowCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        previousSpeed = airConditioner.getSpeed();
        airConditioner.low();
    }

    @Override
    public void undo() {
        if (previousSpeed == AirConditioner.HIGH) {
            airConditioner.high();
        } else if (previousSpeed == AirConditioner.MEDIUM) {
            airConditioner.medium();
        } else if (previousSpeed == AirConditioner.LOW) {
            airConditioner.low();
        } else if (previousSpeed == AirConditioner.OFF) {
            airConditioner.off();
        }
    }
}
