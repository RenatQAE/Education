package Edu.lesson6.Game;

public class Knight implements Hero{
    public void attack(Enemy enemy){
        System.out.println("boom sword");
        enemy.hurts(15);
    }
}
