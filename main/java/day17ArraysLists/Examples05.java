package day17ArraysLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Examples05 {
    public static void main(String[] args) {
        //kullanicidan harf al.sizdeki listte varsa o harfi "bulunduya" cevirin yoksa ekleyin
        List<String> satz = new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Add element");
        String c = scan.next();
        satz.add("A");
        satz.add("K");
        satz.add("R");
        satz.add("S");

            if (satz.contains(c)){
                satz.set(satz.indexOf(c),"bulundu" );
            }else {
                satz.add(c);

        }
        System.out.println(satz);



    }
}
