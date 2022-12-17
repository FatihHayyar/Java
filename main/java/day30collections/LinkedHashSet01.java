package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {

//linkedhashset ler elemanlari ekleme sirasina gore siralar.insertion order
        //linkedhashset ler siralama yaptigi icin hashsetler den yavastir
        LinkedHashSet<String> emails=new LinkedHashSet<>();
        emails.add("abc.email.com");
        emails.add("bc.email.com");
        emails.add("c.email.com");
        emails.add("dbg.email.com");
        emails.add("efg.email.com");
        System.out.println(emails);
    }
}
