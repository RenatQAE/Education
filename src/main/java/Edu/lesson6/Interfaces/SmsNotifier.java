package Edu.lesson6.Interfaces;

import Edu.lesson6.User;

public class SmsNotifier implements Notifier {
    private String server;
    private int port;
    private String token;
    public void notifyUser(User user, String txt) {
        System.out.println("Отправляем смс на номер " + user.getPhone() + " : " + txt);
}
}
