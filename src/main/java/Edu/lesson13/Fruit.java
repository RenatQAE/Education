package Edu.lesson13;

// нельзя создать экземпляр
public abstract class Fruit {
    // есть поля. А в интерфейсе - нет
    protected String name;
    protected String color;

    // может иметь реализацию метода
    public String getName(){
        return  this.color + " "+this.name;
    }

    // а может и не иметь)
    public abstract int getPrice();
}
