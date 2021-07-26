package StrategyDesignPattern.SimUDuckApp.Models;

import StrategyDesignPattern.SimUDuckApp.FlyBehaviorTypes.FlyWithWings;
import StrategyDesignPattern.SimUDuckApp.QuackBehaviorTypes.Quack;

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
