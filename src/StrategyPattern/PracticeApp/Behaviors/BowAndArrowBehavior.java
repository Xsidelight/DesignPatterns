package StrategyPattern.PracticeApp.Behaviors;

import StrategyPattern.PracticeApp.interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Shooting arrow from the bow");
    }
}
