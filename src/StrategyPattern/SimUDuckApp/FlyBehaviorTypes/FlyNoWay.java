package StrategyPattern.SimUDuckApp.FlyBehaviorTypes;

import StrategyPattern.SimUDuckApp.Interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
