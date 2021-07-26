package StrategyDesignPattern.SimUDuckApp.Models;

import StrategyDesignPattern.SimUDuckApp.FlyBehaviorTypes.FlyNoWay;
import StrategyDesignPattern.SimUDuckApp.QuackBehaviorTypes.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println();
    }
}
