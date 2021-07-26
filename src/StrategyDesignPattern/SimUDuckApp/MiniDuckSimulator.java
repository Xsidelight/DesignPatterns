package StrategyDesignPattern.SimUDuckApp;

import StrategyDesignPattern.SimUDuckApp.FlyBehaviorTypes.FlyRocketPowered;
import StrategyDesignPattern.SimUDuckApp.Models.Duck;
import StrategyDesignPattern.SimUDuckApp.Models.MallardDuck;
import StrategyDesignPattern.SimUDuckApp.Models.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
