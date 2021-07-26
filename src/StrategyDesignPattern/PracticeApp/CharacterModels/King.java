package StrategyDesignPattern.PracticeApp.CharacterModels;

import StrategyDesignPattern.PracticeApp.Behaviors.SwordBehavior;

public class King extends Character {
    public King() {
        weaponBehavior = new SwordBehavior();
    }
}
