package AdapterPattern.SimUDuckApp.FlyBehaviorTypes;

import AdapterPattern.SimUDuckApp.Interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
