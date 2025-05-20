package Edu.lesson13;

public class Banana extends Fruit{

    public Banana(){
        super.name = "Банан";
        super.color = "Желтый";
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
