package Edu.lesson3;

public class User {
    String name;
    int age;
    String phone;
    String email;
    double rating;
    boolean isOnline;

    public User(String name, int age, String phone, String email, double rating, boolean isOnline) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.rating = 5.0;
        this.isOnline = isOnline;
    }
}
