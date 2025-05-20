package Edu.lesson13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Fruit,Integer> fruits = new HashMap<>();

        Fruit apple = new Apple();
        Fruit banana = new Banana();

        Set<Fruit> fruits1 = fruits.keySet();
        Collection<Integer> values = fruits.values();
        Set<Entry<Fruit, Integer>> entries = fruits.entrySet();

        Fruit top1 = null;
        Fruit top2 = null;
        Fruit top3 = null;

        for (Entry<Fruit,Integer> entry : entries){
            entry.getKey();
            entry.getValue();

            top1 = entry.getKey();
            top2 = entry.getKey();

        }

    }
}
