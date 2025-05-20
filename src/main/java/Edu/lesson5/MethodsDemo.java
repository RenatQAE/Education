package Edu.lesson5;

import java.util.Scanner;

public class MethodsDemo {
    public static void main(String[] args) {

        String name = "Alex";
        System.out.println(name.toUpperCase());

        Scanner sc = new Scanner(System.in);

        User usr = new User("Alex", 23, true, "+2345676543", "mail@mail.ru");
        System.out.println(usr.age); // 23
        usr.getOlder();
        System.out.println(usr.age); // 24

        User mark = new User("Mark", 48, true, "+2345676543", "mail@mail.ru");
        mark.getOlder();
        System.out.println(mark.age);

        User marta = new User("Marta", 48, true, "+2345676543", "mail@mail.ru");
        marta.age++;
        System.out.println(marta.age);
    }
}