package Edu.lesson13;

public class Apple extends Fruit{

    public Apple(){
        super.name = "Яблоко";
        super.color = "Красное";
    }
    @Override
    public int getPrice() {
        return 300;
    }
}
