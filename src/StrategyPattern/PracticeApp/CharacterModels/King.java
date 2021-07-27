package StrategyPattern.PracticeApp.CharacterModels;

import StrategyPattern.PracticeApp.Behaviors.SwordBehavior;

public class King extends Character {
    public King() {
        weaponBehavior = new SwordBehavior();
    }
}
