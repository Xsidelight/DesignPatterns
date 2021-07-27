package StrategyPattern.SimUDuckApp.Models;

import StrategyPattern.SimUDuckApp.FlyBehaviorTypes.FlyNoWay;
import StrategyPattern.SimUDuckApp.QuackBehaviorTypes.Quack;

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
