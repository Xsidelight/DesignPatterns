package StrategyPattern.PracticeApp.CharacterModels;

import StrategyPattern.PracticeApp.Behaviors.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
