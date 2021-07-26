package StrategyDesignPattern.PracticeApp.Behaviors;

import StrategyDesignPattern.PracticeApp.interfaces.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Chopping with an axe");
    }
}
