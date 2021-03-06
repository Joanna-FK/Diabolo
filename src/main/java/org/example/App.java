package org.example;

import org.example.actor.Monster;
import org.example.actor.Player;

import java.util.List;


public class App {
    public static void main(String[] args) {
        System.out.println("Dungeon master says: Hello World!");
        Player player = PlayerCreator.createPlayer();
        System.out.println(player);

        List<Monster> monsters = MonsterCreationUtil.createMonsters();
        while (player.isAlive() && monsters.stream().anyMatch(m -> m.isAlive())) {
            monsters.stream().filter(m -> m.isAlive()).findFirst().get().receiveDamage(player.attack());

            monsters.stream().filter(m -> m.isAlive())
                    .forEach(singleMonster -> player.receiveDamage(singleMonster.attack()));
        }
        if (player.isAlive()){
            System.out.println("CONGRATULATIONS! You have killed "+ monsters.size());
        } else {
            System.out.println("You died...");
        }
    }
}
