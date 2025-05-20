package Edu.lesson8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesDemo {
    public static void main(String[] args) throws InterruptedException {
        LocalDate date = LocalDate.now();
        System.out.println("date = " + date);
        LocalDate date1 = LocalDate.of(2024, 2, 10);
        System.out.println("date1 = " + date1);
        LocalDate date2 = LocalDate.parse("2024-02-29");
        System.out.println("date2 = " + date2);
        LocalDate subscription = date.plusDays(90);
        System.out.println("-3 weeks = " + date.minusWeeks(3));
        System.out.println("subscription = " + subscription);

        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);

        LocalTime time1 = LocalTime.parse("22:17:36");
        LocalTime time2 = time1.plusMinutes(43);
        System.out.println(time2);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

//        LocalDateTime dateTime = LocalDateTime.parse();
//        System.out.println(dateTime);

        LocalDateTime todayMinus3Hours = LocalDateTime.of(LocalDate.now(), LocalTime.now().minusHours(3));
        System.out.println("of = " + todayMinus3Hours);

        // yyyy year
        // MM month
        // dd day

        // HH
        // mm
        // ss
        // SSS
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("G HH:mm");
        String format = formatter.format(todayMinus3Hours);

        System.out.println(format);
    }

}
