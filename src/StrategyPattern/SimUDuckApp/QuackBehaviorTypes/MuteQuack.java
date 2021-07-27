package StrategyPattern.SimUDuckApp.QuackBehaviorTypes;

import StrategyPattern.SimUDuckApp.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}