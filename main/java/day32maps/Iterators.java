package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        List<String> mylist= new ArrayList<>();
        mylist.add("z");
        mylist.add("k");
        mylist.add("s");
        mylist.add("a");
        mylist.add("m");
        //for loop kullanarak her elemanin sonuna ! ekle

        for (String w:mylist){

            mylist.set(mylist.indexOf(w),w+"!" );
        }

        System.out.println(mylist);

        ListIterator<String> itrt=mylist.listIterator();
        while (itrt.hasNext()){
            String str=itrt.next();//en bastan baslar harfi alir bir sonrakine gecer
            itrt.set(str+"!");
        }
        System.out.println(mylist);
    }
}
