package Edu.lesson4;

public class Track {
    int duration;
    String author;

    String title;
    int year;
    byte[] data;

    public Track(int duration, String author, String title,int year, byte[] data) {
        this.duration = duration;
        this.author = author;
        this.title = title;
        this.data = data;
        this.year = year;
    }
}
