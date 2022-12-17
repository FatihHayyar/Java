package day19datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayTime02 {
    public static void main(String[] args) {
        //javadan alinan date ay gun yil olarak yazin
        LocalDate date = LocalDate.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String tarih=dtf.format(date);
        System.out.println("tarih = " + tarih);

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MMM-dd-yyyy");//ayi strin ilk 3 harfi
        String tarih1=dtf1.format(date);
        System.out.println("tarih = " + tarih1);

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMMM-dd-yyyy");//tum ayi yazar
        String tarih2=dtf2.format(date);        //tek m de ise ayi tek hane yazmaya calisir
        System.out.println("tarih = " + tarih2);

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("MM-dd-yy");//yilin son ikisini yazar
        String tarih3=dtf3.format(date);
        System.out.println("tarih = " + tarih3);
    }
}
