package AdventureGame.Characters;

import AdventureGame.FightingStyle.WeaponBehaviour;

public abstract class Character {
    WeaponBehaviour weaponBehaviour;

    public abstract void fight();

    public void setWeapon(WeaponBehaviour wb) {
        weaponBehaviour = wb;
    }
}
