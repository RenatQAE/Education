package Edu.lesson3;

public class Playgroung {
    public static void main(String[] args) {
        int count = 1;
        int divider = 10;
        String city = "Kazan";

        User user1 = new User("Renat",30,"+79872","mail@mail.ru",4.8,true);
        User user2 = new User("Alina",27,"+79050","mail2@mail.ru",4.5,false);

        Smartphone iphone15 = new Smartphone();
        System.out.println(iphone15.hddGb);

        Smartphone iphone16 = new Smartphone();
        System.out.println(iphone16.hddGb);

        Car car1 = new Car();
        car1.brand = "Mazda";
        car1.model = "mx-5";
        car1.color = "red";
        car1.price = 123456;
        car1.engineV = 1.5;
        car1.year = 2000;



        int x = 5;
        String a = "test";

        Smartphone cellphone = new Smartphone();
        cellphone.color ="red";
        cellphone.brand="samsung";

    }
}
