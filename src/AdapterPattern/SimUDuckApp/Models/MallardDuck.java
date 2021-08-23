package AdapterPattern.SimUDuckApp.Models;

import AdapterPattern.SimUDuckApp.FlyBehaviorTypes.FlyWithWings;
import AdapterPattern.SimUDuckApp.QuackBehaviorTypes.Quack;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
