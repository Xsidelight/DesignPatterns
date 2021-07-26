package StrategyDesignPattern;

import StrategyDesignPattern.FlyBehaviorTypes.FlyRocketPowered;
import StrategyDesignPattern.Models.Duck;
import StrategyDesignPattern.Models.MallardDuck;
import StrategyDesignPattern.Models.ModelDuck;

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
