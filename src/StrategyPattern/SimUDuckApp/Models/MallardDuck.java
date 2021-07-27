package StrategyPattern.SimUDuckApp.Models;

import StrategyPattern.SimUDuckApp.FlyBehaviorTypes.FlyWithWings;
import StrategyPattern.SimUDuckApp.QuackBehaviorTypes.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }


    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
