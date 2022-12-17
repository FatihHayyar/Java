package day30collections;

import java.util.LinkedList;

public class Example1 {
    // A ile baslayan tum isimleri ***** ceviriniz
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        for (String w : names) {
            if (w.startsWith("A")){
                names.set(names.indexOf(w),"*****");
            }
        }
        System.out.println(names);
    }
}
