package StrategyDesignPattern.PracticeApp.Behaviors;

import StrategyDesignPattern.PracticeApp.interfaces.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Cutting with knife");
    }
}
