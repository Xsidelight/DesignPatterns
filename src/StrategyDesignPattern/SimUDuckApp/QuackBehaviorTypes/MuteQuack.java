package StrategyDesignPattern.SimUDuckApp.QuackBehaviorTypes;

import StrategyDesignPattern.SimUDuckApp.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}