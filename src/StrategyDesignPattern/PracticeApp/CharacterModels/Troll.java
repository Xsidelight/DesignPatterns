package StrategyDesignPattern.PracticeApp.CharacterModels;

import StrategyDesignPattern.PracticeApp.Behaviors.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
