package StrategyPattern.SimUDuckApp.QuackBehaviorTypes;

import StrategyPattern.SimUDuckApp.Interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
