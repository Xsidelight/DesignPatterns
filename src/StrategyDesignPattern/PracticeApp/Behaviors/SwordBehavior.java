package StrategyDesignPattern.PracticeApp.Behaviors;

import StrategyDesignPattern.PracticeApp.interfaces.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword");
    }
}
