package StrategyDesignPattern.PracticeApp;

import StrategyDesignPattern.PracticeApp.Behaviors.AxeBehavior;
import StrategyDesignPattern.PracticeApp.CharacterModels.Character;
import StrategyDesignPattern.PracticeApp.CharacterModels.Knight;

public class GameApp {
    public static void main(String[] args) {
        Character sirBob = new Knight();
        sirBob.fight();
        sirBob.setWeaponBehavior(new AxeBehavior());
        sirBob.fight();
    }
}
