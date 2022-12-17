package day19datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {
        //Japonya ile almanya arasindaki zaman farkini hesapla
        LocalDateTime datejapan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime dategerman=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
long fark= ChronoUnit.HOURS.between(dategerman,datejapan);
        System.out.println("fark = " + fark);
//Usa icin wooaww yazin UK icin big yazin Tr icin vatan yazin
Countries country = Countries.Tr;
switch (country) {
    case Usa:
        System.out.println("woaww");
        break;
    case Tr:
        System.out.println("vatan");
        break;
    default:
        System.out.println("gecersiz ulke");
}


    }
}
