package CommandPattern.Example;

public class HallLightOnCommand implements Command{
    Light light;

    public HallLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
