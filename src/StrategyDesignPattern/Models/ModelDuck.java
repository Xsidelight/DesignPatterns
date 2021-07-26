package StrategyDesignPattern.Models;

import StrategyDesignPattern.FlyBehaviorTypes.FlyNoWay;
import StrategyDesignPattern.QuackBehaviorTypes.Quack;

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
