package Edu.lesson6.Interfaces;

import Edu.lesson6.User;

public class Playground {
    public static void main(String[] args) {
        User u1 = new User("Alex");
        u1.setBalance(100);
        u1.setPhone("8934232314");
        u1.setEmail("test1@MAIL.RU");

        User u2 = new User("Mark");
        u2.setBalance(50);
        u2.setEmail("test2@MAIL.RU");
        u2.setPhone("8934232315");

        User u3 = new User("Inna");
        u3.setBalance(200);
        u3.setEmail("test3@MAIL.RU");
        u3.setPhone("8934232319");

        BalanceService service = new BalanceService(new WatsAppNotifier());
        service.processUser(u1);
        service.processUser(u2);
        service.processUser(u3);
    }
}