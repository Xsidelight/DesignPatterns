package AdapterPattern.SimUDuckApp.FlyBehaviorTypes;

import AdapterPattern.SimUDuckApp.Interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
