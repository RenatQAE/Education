package Edu.lesson3;

public class StringMethods {
    public static void main(String[] args) {
        String name = ""+"Renat";

        // приводит содержимое строки к верхнему регистру
        String upperCaseName = name.toUpperCase();
        // к нижнему регистру
        String lowerCaseName = name.toLowerCase();

        boolean empty = "".isEmpty();
        boolean blank = "    ".isBlank();

        System.out.println("upperCaseName = " + upperCaseName);
        System.out.println("lowerCaseName = " + lowerCaseName);
        System.out.println("name = " + name);

        System.out.println("empty = " + empty);
        System.out.println("blank = " + blank);

        String letters1 = "DEF";
        String letters2 = "ABC";
        System.out.println(letters2+letters1);

        String url = "https://vk.com";
        boolean startsWithS = url.startsWith("https://");

        startsWithS=url.startsWith("https://");
        System.out.println("connection is secure = "+startsWithS);

        System.out.println( "Ресторан \"Вкусно и точка\"" );

        System.out.println( "\\\\\\\\\\\\\\" );
        System.out.println( "///////" );


        //https://vk.com
        String protocol = url.substring(0, 5);
        System.out.println(protocol);

        System.out.println(protocol.equals("https"));

        // StringIndexOutOfBoundsException
        int i = 0;

        String passportSerial = "0119 012567";

        String phoneNumber = "F TR JDS HSDLJH";

        String number = "+79462340897";

        System.out.println(passportSerial);


    }
}
