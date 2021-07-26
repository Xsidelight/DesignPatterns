package StrategyDesignPattern.PracticeApp.CharacterModels;

import StrategyDesignPattern.PracticeApp.Behaviors.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
