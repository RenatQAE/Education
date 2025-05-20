package Edu.lesson4;

public class ArrayIntro {
    public static void main(String[] args) {


        int x = 4; // 4
        long y = 8; // 8
        x = 5;
        System.out.println(x);

        long[] marks = new long[10];

        // DANGER
        // long[] numbers = new long[1_000_000_000];

        String[] names = new String[5];

        names[0] = "Галина";
        names[1] = "Данила";
        names[2] = "Никита";
        names[3] = "Анна";
        names[4] = "Милана";

        System.out.println(names[1]);

        // System.out.println( names[99] ); // ArrayIndexOutOfBoundsException
        // names[0] = 10; incompatible types: int cannot be converted to java.lang.String

        int[] myNumber = new int[2];

        int[] a1 = new int[5];
        int[] a2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] a3 = {1, 2, 3, 4, 5, 6, 7};

        String[] cities = {"Moscow", "Tokyo", "Berlin"};
        byte[] bytes = {8, 12, 20, 2, 0, 0, 10};
        char[] letters = new char[] {'a', 'b', 'c', 'd'};
        boolean[] values = new boolean[5];
        values[0] = true;
        values[1] = true;
        values[2] = true;
        values[3] = false;
        values[4] = false;




    }
}
