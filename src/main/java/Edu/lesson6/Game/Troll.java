package Edu.lesson6.Game;

public class Troll implements Enemy{
    private int hp = 50;
    private boolean isAlive = true;

    public void hurts(int hp) {

        if (this.hp > 0){
            System.out.println("Оuch it hurts on " + hp +" hp");
            this.hp = this.hp - hp;
        }

        if (this.hp <= 0){
            this.isAlive = false;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }
}
