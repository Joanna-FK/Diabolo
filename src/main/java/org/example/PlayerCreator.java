package org.example;

import org.example.actor.Player;

import java.util.Scanner;

public class PlayerCreator {

    public static Player createPlayer() {
        System.out.println("Choose your weapon: 1 - sword, 2 - mace, 3 - no weapon");
        Scanner sc = new Scanner(System.in);
        int chosenOption = sc.nextInt();
        WeaponType weaponType;
        if (chosenOption == 1) {
            weaponType = WeaponType.SWORD;

        } else if (chosenOption == 2) {
            weaponType = WeaponType.MACE;
        } else {
            weaponType = WeaponType.UNARMED;
        }
        return new Player(weaponType);
    }
}
