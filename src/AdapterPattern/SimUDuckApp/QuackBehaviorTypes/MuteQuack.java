package AdapterPattern.SimUDuckApp.QuackBehaviorTypes;

import AdapterPattern.SimUDuckApp.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}