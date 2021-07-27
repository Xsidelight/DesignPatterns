package StrategyPattern.PracticeApp.CharacterModels;

import StrategyPattern.PracticeApp.Behaviors.KnifeBehavior;

public class Knight  extends  Character{
    public Knight() {
        weaponBehavior = new KnifeBehavior();
    }
}
