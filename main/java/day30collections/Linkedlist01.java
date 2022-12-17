package day30collections;

import java.util.LinkedList;

public class Linkedlist01 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);
        System.out.println(names.peek());//ilk elemani verir list bossa null verir
        names.poll();//pop la ayni ama hata vermiyor null veriyor
        System.out.println(names.element());//ilk elemani verir silmez list bossa exception atar
    }
}