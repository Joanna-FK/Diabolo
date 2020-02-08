package org.example;

public enum WeaponType {

    SWORD (10),
    MACE (5),
    UNARMED (1);

  private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
