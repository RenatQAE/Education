package Edu.lesson8;

import java.awt.*;
import java.time.LocalTime;
import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        System.out.println("Во сколько Вас Разбудить?");
        String input = new Scanner(System.in).nextLine();

        processInput(input);
        System.out.println("Finish");
    }

    public static void processInput(String input) {
        try {
            LocalTime alarm = LocalTime.parse(input);

            for (int i = 0; i < 10000; i++) {
                Thread.sleep(1000L);
                LocalTime now = LocalTime.now();

                System.out.println(now);
                if (now.isAfter(alarm)) {
                    System.out.println("Будим!!!");
                    Toolkit.getDefaultToolkit().beep();
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("e ="+e.getMessage());
        }
    }
}