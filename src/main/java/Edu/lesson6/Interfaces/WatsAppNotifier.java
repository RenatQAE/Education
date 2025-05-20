package Edu.lesson6.Interfaces;

import Edu.lesson6.User;

public class WatsAppNotifier implements Notifier{
    public void notifyUser(User user, String txt) {
        System.out.println("Уведомляем по WA: " + txt );
    }
}
