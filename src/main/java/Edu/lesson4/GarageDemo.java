package Edu.lesson4;

public class GarageDemo {

    /**
     * Создать класс Car;
     * Создать массив garage;
     * Поместить 5 автомобилей в гараж;
     */
    public static void main(String[] args) {

        Car mySuperCar = new Car("A1234BC", "Yellow");

        Car[] garage = new Car[5];
        garage[0] = mySuperCar;
        garage[1] = new Car("P543AB", "White");
        garage[2] = new Car("X453TY", "Black");


        Car milanaCar = new Car("", "");
        Car milanaCar2 = new Car("", "");
        Car milanaCar3 = new Car("", "");
    }
}
