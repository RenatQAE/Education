package Edu;

import java.io.PrintStream;
import java.util.Scanner;

public class CakeTask {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {

        int x1;
        int x2;
        int x3;

        x1 = in.nextInt();
        x2 = x1 % 10;
        x3 = x1 / 10 % 10;
        if (x3 == 1){
            System.out.println(x1 + " "+ "ТОРТОВ");
        }
        else if (x2 == 1){
            System.out.println(x2 + " "+ "ТОРТ");
        }
        else if (x2 > 1 && x2 <=4){
            System.out.println(x1 + " "+ "ТОРТА");
        }
    }
}
