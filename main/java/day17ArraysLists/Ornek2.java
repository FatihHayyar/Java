package day17ArraysLists;

import java.util.ArrayList;
import java.util.List;

public class Ornek2 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        //asagidaki listte
        //a) Shoes elemaninin ilk gorumunu silin
        a.remove("Shoes");
        System.out.println(a);
// Shoes hepsini sil
        List<String> list = new ArrayList<String>();//removeall sadece llist ile siler
        list.add("Shoes");
       a.removeAll(list);
        System.out.println(a);


    }
}
