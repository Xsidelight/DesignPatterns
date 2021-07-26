package StrategyDesignPattern.SimUDuckApp.QuackBehaviorTypes;

import StrategyDesignPattern.SimUDuckApp.Interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
