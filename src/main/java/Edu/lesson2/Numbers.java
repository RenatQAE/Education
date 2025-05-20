package Edu.lesson2;

public class Numbers {
    public static void main(String[] args) {
        // ключевое слово - объявляем переменную
        // имя переменной
        //  значение
        var MyBalance = 100;

        byte myAge = 100; // 255 -> 11111111 [1байт]
        short bookPageCount = 256; // [2байта] 32к+
        int russianPopulation = 146000000; // [4байта] 2B +
        long theWorldPopulation = 8_000_000_000L; // [8байта] 10^18 +

        float piFloat = 3.14f; // [4байта]
        double piDouble = 3.14; // [8байта]

        boolean isActive = true; // false [1 bit]

        char f = 'a';

        int a = 100;
        int b = 20;

        System.out.println( a+b );
        System.out.println( a-b );
        System.out.println( a/b );
        System.out.println( a*b );

        System.out.println( a > b );
        System.out.println( a < b );
        System.out.println( a == b );
        System.out.println( a != b );
        System.out.println( a >= b );
        System.out.println( a <= b );


    }
}
