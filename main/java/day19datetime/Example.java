package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example {
    public static void main(String[] args) {
        //javadan alinan time in formatini degistirin

LocalTime hours= LocalTime.of(22,25,41,489);
        System.out.println("hours = " + hours);
        DateTimeFormatter newdate= DateTimeFormatter.ofPattern("hh:mm a");
        String stdate=hours.format(newdate);//buyuk H ler 24 luk saat dilimi icin
        System.out.println("stdate = " + stdate);// en son a a koyarsak pm ama yazar
    }
}
