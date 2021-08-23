package AdapterPattern.SimUDuckApp.QuackBehaviorTypes;

import AdapterPattern.SimUDuckApp.Interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
