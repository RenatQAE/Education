package Edu.lesson6;

public class Card {
    String number;
    String pin;

    public Card(String number, String pin) {
        this.number = number;
        this.pin = pin;
    }
    public void getNumber(){
        System.out.println(" **** **** **** " + number.substring(number.length() - 4));
    }
    public void getNumber(String pin){
        if (pin.equals(this.pin)){
            System.out.println(this.number);
        }else {
            getNumber();

        }
    }
}
