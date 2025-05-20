package Edu.lesson7;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();

        strings.add("Nikita");
        strings.add("Женя");
        strings.add("Камиль");
        strings.add("Галина");
        strings.add("Игорь");
        strings.add("Вадим");
        strings.add("Елена");
        strings.add("Дима");

        strings.add(1, "Ринат");

        strings.remove("Женя");
        strings.remove(1);

        System.out.println(strings.size());

        for (String string : strings) {
            System.out.println(string.toUpperCase());
        }

        System.out.println(strings.get(3));

        System.out.println(strings.contains("Вадим"));

    }
}
