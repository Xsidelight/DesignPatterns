package CommandPattern.Example;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        RemoteControl remoteControl = new RemoteControl();
        RemoteControl acRemoteControl = new RemoteControl();

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


        AirConditioner airConditioner = new AirConditioner("Dining Room");
        ACMediumCommand acMediumCommand = new ACMediumCommand(airConditioner);
        ACHighCommand acHighCommand = new ACHighCommand(airConditioner);
        ACOffCommand acOffCommand = new ACOffCommand(airConditioner);

        acRemoteControl.setCommand(0, acMediumCommand, acOffCommand);
        acRemoteControl.setCommand(1, acHighCommand, acOffCommand);
        acRemoteControl.onButtonWasPushed(0);
        acRemoteControl.offButtonWasPushed(0);
        System.out.println(acRemoteControl);
        acRemoteControl.undoButtonWasPressed();
        acRemoteControl.onButtonWasPushed(1);
        System.out.println(acRemoteControl);
        acRemoteControl.undoButtonWasPressed();

        Command[] multipleOnCommandExecution = {garageDoorOpenCommand, hallLightOnCommand};
        Command[] multipleOffCommandExecution = {acOffCommand, hallLightOffCommand};


        System.out.println("--------------------------");

        MacroCommand testMacroOnCommand = new MacroCommand(multipleOnCommandExecution);
        MacroCommand testMacroOffCommand = new MacroCommand(multipleOffCommandExecution);

        remoteControl.setCommand(0, testMacroOnCommand, testMacroOffCommand);
        remoteControl.onButtonWasPushed(0);

        System.out.println("--------------------------");

        remoteControl.offButtonWasPushed(0);

    }
}
