package org.example.actor;

import org.example.AbleToAttack;

public abstract class Monster extends Creature implements AbleToAttack {

    @Override
    public String toString() {
        return "Monster{" +
                "hp=" + hp +
                ", alive=" + alive +
                ", strength=" + strength +
                ", weaponType=" + weaponType +
                '}';
    }
}
