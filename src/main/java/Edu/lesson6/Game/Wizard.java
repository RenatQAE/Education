package Edu.lesson6.Game;

public class Wizard implements Hero{
    @Override
    public void attack(Enemy enemy) {
        System.out.println("Casting spell");
        enemy.hurts(10);
    }
}
