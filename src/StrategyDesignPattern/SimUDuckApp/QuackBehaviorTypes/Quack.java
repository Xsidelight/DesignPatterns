package StrategyDesignPattern.SimUDuckApp.QuackBehaviorTypes;

import StrategyDesignPattern.SimUDuckApp.Interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}