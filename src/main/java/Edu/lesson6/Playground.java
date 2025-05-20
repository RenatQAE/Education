package Edu.lesson6;

public class Playground {
    public static void main(String[] args) {
        int x = 5; // [][][][] => 5
        int y = x; // [][][][] => 5
        x = 10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        User u1 = new User("Alex");
        User u2 = new User("Mark");
        User u3 = u2;
        User u4 = u2;

        u2.setRating(5);

        System.out.println("u1 = " + u1.getName() + " " + u1.getRating());
        System.out.println("u2 = " + u2.getName() + " " + u2.getRating());
        System.out.println("u3 = " + u3.getName() + " " + u3.getRating());
        System.out.println("u3 = " + u4.getName() + " " + u4.getRating());


    }
}
