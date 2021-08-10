package CommandPattern.Example;

public class HallLightOffCommand implements Command {
    Light light;

    public HallLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
