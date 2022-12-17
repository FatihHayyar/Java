package day30collections;

import java.util.LinkedList;

public class Example2 {
    //listteki 4 harften fazla olan isimleri silin
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > 4) {
                names.remove(names.get(i));
                i--;
            }
        }
        System.out.println(names);
    }
}
