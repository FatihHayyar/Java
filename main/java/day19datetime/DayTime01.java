package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DayTime01 {
    public static void main(String[] args) {
        //anlik tarihi ekrana yazdiran kodu yazdirin
        LocalDate date =LocalDate.now();
        System.out.println(date);
        //anlik zamani alalim
LocalTime saat=LocalTime.now();
        System.out.println("saat = " + saat);
//anlik zamani ve tarihi yazdiralim
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);
        //Japonya daki anlik tarih ve zamani yazdiralim
LocalDateTime datetimejapan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("datetimejapan = " + datetimejapan);
        //Istanbul daki anlik tarih ve zamani yazdiralim
        LocalDateTime datetimeIstanbul=LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("datetimeIstanbul = " + datetimeIstanbul);
        //istedigim tarihten itibaren 789 gun sonra emekli olcaginiza gore emeklilik tarihini hesaplayin
        LocalDate prison=LocalDate.of(2016,7,15);
LocalDate retiredate=prison.plusDays(789);
        System.out.println("retiredate = " + retiredate);
//2 cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayin
LocalDate osmandt=LocalDate.of(2012,9,14);
        LocalDate ummudt=LocalDate.of(2014,12,16);
        long fark =ChronoUnit.DAYS.between(osmandt,ummudt);
        System.out.println("fark = " + fark); //once gecmis tarih yazilir yoka eksi verir
//Tom ali den 3 yil 8 ay 13 gun sonra dogdu.Ali ise Veliden 1 yil 15 gun once dogdu.
        //Tom un dogum tarihi 18 kasim 2011 isedigerleri nedir
        LocalDate tomdt=LocalDate.of(2011,11,18);
       LocalDate alidt= tomdt.minusDays(13).minusMonths(8).minusYears(3);
        System.out.println("alidt = " + alidt);
LocalDate velidt=alidt.minusDays(15).minusYears(1);
        System.out.println("velidt = " + velidt);
        //istanbulun fethi ile cumhuriyetin kurulmasi arasinda kac ay fark var
        LocalDate istfeth=LocalDate.of(1453,5,29);
        LocalDate cumh=LocalDate.of(1923,10,29);

       long fark2= ChronoUnit.MONTHS.between(istfeth,cumh);
        System.out.println("fark2 = " + fark2);
//verilen tarihin hangi burcta oldugunu gosteren tarihi bulun
LocalDate mydate=LocalDate.of(1987,12,10);
        int gun=mydate.getDayOfMonth();
        int ay=mydate.getMonthValue();
        System.out.println(gun+" "+ay);
String burc="";
        if(ay==1){
            if(gun<=19){burc="oğlak";}
            if(gun>19){burc="kova";}
        }
        if(ay==2){
            if(gun<=18){burc="kova";}
            if(gun>18){burc="balık";}
        }
        if(ay==3){
            if(gun<=19){burc="balık";}
            if(gun>19){burc="koç";}
        }
        if(ay==4){
            if(gun<=19){burc="koç";}
            if(gun>19){burc="boğa";}
        }
        if(ay==5){
            if(gun<=20){burc="boğa";}
            if(gun>20){burc="ikizler";}
        }
        if(ay==6){
            if(gun<=21){burc="ikizler";}
            if(gun>21){burc="yengeç";}
        }
        if(ay==7){
            if(gun<=22){burc="yengeç";}
            if(gun>22){burc="aslan";}
        }
        if(ay==8){
            if(gun<=22){burc="aslan";}
            if(gun>22){burc="başak";}
        }
        if(ay==9){
            if(gun<=22){burc="başak";}
            if(gun>22){burc="terazi";}
        }
        if(ay==10){
            if(gun<=22){burc="terazi";}
            if(gun>22){burc="akrep";}
        }
        if(ay==11){
            if(gun<=21){burc="akrep";}
            if(gun>21){burc="yay";}
        }
        if(ay==12){
            if(gun<=21){burc="yay";}
            if(gun>21){burc="oğlak";}
        }
        System.out.println("Burcunuz:"+burc);

    }
}
