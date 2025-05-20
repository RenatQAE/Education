package Edu.lesson5;

import java.util.Scanner;

public class LogicOperations {
    public static void main(String[] args) {

        String url ="http://vk.com";

        System.out.println( true );
        System.out.println( !true );// true == !false; false == !true
         System.out.println( 10 == 10 );
         System.out.println( !(10 == 10) );
         System.out.println( !(10 == 10) );
         System.out.println( url.startsWith("https"));
         System.out.println( !url.startsWith("https"));

        // ИЛИ
        boolean haveMoney = false;
        boolean haveCard = true;

        System.out.println( haveMoney || haveCard);

        String username = "Alex";
        String password = "qwerty";

        // И
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String pass = scanner.nextLine();

        if ( username.equals(login) && password.equals(pass) ){
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }
    }
}
