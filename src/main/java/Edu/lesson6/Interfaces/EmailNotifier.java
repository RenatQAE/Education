package Edu.lesson6.Interfaces;

import Edu.lesson6.User;

public class EmailNotifier implements Notifier {
    private String server;
    private int port;
    private String login;
    private String pass;

    public void notifyUser(User user, String txt){
        System.out.println("Отправляем E-mail на адрес " + user.getEmail() + " : " + txt);
    }
}
