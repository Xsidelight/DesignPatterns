package StrategyPattern.PracticeApp.Behaviors;

import StrategyPattern.PracticeApp.interfaces.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword");
    }
}
