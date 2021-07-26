package StrategyDesignPattern.PracticeApp.Behaviors;

import StrategyDesignPattern.PracticeApp.interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Shooting arrow from the bow");
    }
}
