package StrategyDesignPattern.PracticeApp.CharacterModels;

import StrategyDesignPattern.PracticeApp.interfaces.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public  Character() {}

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }
}
