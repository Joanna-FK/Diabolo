package org.example.actor;

import org.example.WeaponType;

public class Ghul extends Monster {

public Ghul(){
    hp = 50;
    strength = 8;
    weaponType = WeaponType.UNARMED;
    alive = true;
}

    @Override
    public int attack() {
        return strength + weaponType.getDamage();
    }
}
