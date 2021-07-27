package StrategyPattern.SimUDuckApp;

import StrategyPattern.SimUDuckApp.FlyBehaviorTypes.FlyRocketPowered;
import StrategyPattern.SimUDuckApp.Models.Duck;
import StrategyPattern.SimUDuckApp.Models.MallardDuck;
import StrategyPattern.SimUDuckApp.Models.ModelDuck;

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
