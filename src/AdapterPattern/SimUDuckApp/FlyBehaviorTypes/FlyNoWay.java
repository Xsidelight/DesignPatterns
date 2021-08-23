package AdapterPattern.SimUDuckApp.FlyBehaviorTypes;

import AdapterPattern.SimUDuckApp.Interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
