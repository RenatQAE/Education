package Edu.lesson6;

public class User {
    private String name;
    private int age;
    private String email;
    private String phone;
    private double rating;
    private boolean isOnline;

    private int balance;

    public User(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public double getRating() {
        return rating;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        name.toUpperCase();
        return name;
    }

    public void notifyEmail(String message){

        System.out.println("Уведомляем пользователя на почту " + email + " : " + message);
    }
}
