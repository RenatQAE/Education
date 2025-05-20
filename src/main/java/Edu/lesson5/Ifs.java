package Edu.lesson5;

public class Ifs {
    public static void main(String[] args) {
        double amount = 100;
        String promocode = "javainno";

        if (promocode.equals("inno")){
            amount = amount*0.9;
        }
        if (promocode.equals("java")){
            amount = amount*0.95;
        }
        System.out.println(amount);
    }
}
