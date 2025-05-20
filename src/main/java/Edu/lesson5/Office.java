package Edu.lesson5;

public class Office {
    public static void main(String[] args) {


    Employee alex = new Employee("Alex", 100);
    Employee marta = new Employee("Marta", 120);
    Employee mark = new Employee("Mark", 50);

        alex.down(0.75);
        System.out.println(alex.getSalary());

        marta.up(1.2);
        System.out.println(marta.getSalary());

        mark.up(2);
        System.out.println(mark.getSalary());

        mark.changeName("Tony");
        System.out.println(mark.getName());

    }
}
