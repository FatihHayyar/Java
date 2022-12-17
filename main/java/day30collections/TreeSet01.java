package day30collections;

import java.time.LocalTime;
import java.util.TreeSet;

public class TreeSet01 {
    //Alfabetic ve rakamsal siralama yapar (natural order)
    //cok yavas calisir
    public static void main(String[] args) {
        // 8 tane unique string i alfabetik siralayin
        TreeSet<String> emails = new TreeSet<>();
        long st= LocalTime.now().toNanoOfDay();
        emails.add("a.email.com");
        emails.add("k.email.com");
        emails.add("c.email.com");
        emails.add("d.email.com");
        emails.add("z.email.com");
        emails.add("m.email.com");

        System.out.println(emails);
        long st2= LocalTime.now().toNanoOfDay();
        System.out.println(st2-st);
        //cok yavas oldugu icin once hashset le ekleriz sonra treeset e ceviririz.
    }
}
