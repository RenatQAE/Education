package Edu.lesson5;

public class User {
    String name;
    int age;
    String phone;
    String email;
    double rating;
    boolean isOnline;
    String password;

    public User(String myName, int myAge, boolean status, String myPhone, String myEmail) {
        age = myAge;
        name = myName;
        phone = myPhone;
        email = myEmail;
        isOnline = status;
        rating = 5.0;
    }

    public void getOlder() {
        System.out.println("Сегодня я стал старше");
        age = age + 1;
    }
}
