package StrategyPattern.PracticeApp.CharacterModels;

import StrategyPattern.PracticeApp.Behaviors.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
