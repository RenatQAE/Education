package Edu.lesson7;

import Edu.lesson6.Game.*;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        Enemy t = new Troll();

        List<Hero> squad = new ArrayList<>();
        List<Enemy> enemies = new ArrayList<>();

        squad.add(new Knight());
        squad.add(new Wizard());

        enemies.add(t);

        for (Hero hero : squad) {
            hero.attack(t);
        }

    }
}
