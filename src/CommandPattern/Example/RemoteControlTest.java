package CommandPattern.Example;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Light hallLight = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        HallLightOffCommand hallLightOffCommand = new HallLightOffCommand(hallLight);
        HallLightOnCommand hallLightOnCommand = new HallLightOnCommand(hallLight);


        remoteControl.setCommand(1, hallLightOnCommand, hallLightOffCommand);
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);


    }
}
