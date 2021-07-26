package StrategyDesignPattern.SimUDuckApp.FlyBehaviorTypes;

import StrategyDesignPattern.SimUDuckApp.Interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
