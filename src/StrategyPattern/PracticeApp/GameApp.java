package StrategyPattern.PracticeApp;

import StrategyPattern.PracticeApp.Behaviors.AxeBehavior;
import StrategyPattern.PracticeApp.CharacterModels.Character;
import StrategyPattern.PracticeApp.CharacterModels.Knight;

public class GameApp {
    public static void main(String[] args) {
        Character sirBob = new Knight();
        sirBob.fight();
        sirBob.setWeaponBehavior(new AxeBehavior());
        sirBob.fight();
    }
}
