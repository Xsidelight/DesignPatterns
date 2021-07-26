package StrategyDesignPattern.PracticeApp.CharacterModels;

import StrategyDesignPattern.PracticeApp.Behaviors.KnifeBehavior;

public class Knight  extends  Character{
    public Knight() {
        weaponBehavior = new KnifeBehavior();
    }
}
