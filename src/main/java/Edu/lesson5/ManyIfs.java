package Edu.lesson5;

import java.util.Scanner;

public class ManyIfs {
    public static void main(String[] args) {

        // xs -> 40-42
        // s -> 44-46
        // m -> 48-50
        // l -> 52-54
        // xl -> 56-58

        String size = new Scanner(System.in).nextLine();
        size = size.toLowerCase();

        if (size.equals("xs")) {
            System.out.println("->>>> 40-42");
        } else if (size.equals("s")) {
            System.out.println("->>>> 44-46");
        } else if (size.equals("m")) {
            System.out.println("->>>> 48-50");
        } else if (size.equals("l")) {
            System.out.println("->>>> 52-54");
        } else if (size.equals("xl")) {
            System.out.println("->>>> 56-58");
        }

        switch (size) {
            case "xs":
                System.out.println("40-42");
                break;
            case "s":
                System.out.println("44-46");
                break;
            case "m":
                System.out.println("48-50");
                break;
            case "x":
                System.out.println("52-54");
                break;
            case "xl":
                System.out.println("56-58");
                break;
            default:
                System.out.println("У нас нет таких размеров");
        }

    }
}
