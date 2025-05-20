package Edu.lesson7;

import Edu.lesson6.User;

import java.util.HashMap;
import java.util.Map;

public class ObjectsDemo {
    // DB Books
    // isbn | title | author | year

    // JSON
    // isbn | title | author | year

    public static void main(String[] args) {
        Book bookDb = new Book("12345-213452-324132", "12 стульев", "И.Ильф, Е.Петров", 1927);

        Book bookJSON = new Book("12345-213452-324132", "12 стульев", "И.Ильф, Е.Петров", 1927);

        // сравнивает ссылки на объект. true, если ссылаемся на 1 объект
        // System.out.println( bookDb == bookJSON );

        System.out.println(bookJSON.equals(bookDb));


        System.out.println(bookJSON.hashCode());
        System.out.println(bookDb.hashCode());


        Map<Book, User> library =new HashMap<>();

        library.put(bookDb, new User("Alex"));

        Book userInput = new Book("12345-213452-324132", "12 стульев", "И.Ильф, Е.Петров", 1927);
        System.out.println( library.get( userInput ).getName());

        System.out.println(bookJSON);
}}
