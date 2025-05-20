package Edu.lesson7;

import Edu.lesson6.Game.Hero;
import Edu.lesson6.Game.Knight;
import Edu.lesson6.Game.Wizard;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Hero> players = new HashMap<>();

        players.put("Hunter777", new Wizard());
        players.put("Nooooob", new Knight());
        players.put("Pro", new Knight());

        players.put("Nooooob", new Wizard());

        Hero knight = players.get("Pro");


        Map<Integer, String> test = new HashMap<>();

        Integer x = 10;
        x.hashCode();

    }
}
