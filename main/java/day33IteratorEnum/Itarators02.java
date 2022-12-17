package day33IteratorEnum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Itarators02 {
    public static void main(String[] args) {
        List<String> mylist= new ArrayList<>();
        mylist.add("z");
        mylist.add("k");
        mylist.add("s");
        mylist.add("a");
        mylist.add("m");

//iterator kullanarak list elemanlarini tersten yazdirin
        ListIterator<String> newlist=mylist.listIterator();
while(newlist.hasNext()) {
    newlist.next();
}while (newlist.hasPrevious()) {
   String eleman= newlist.previous();
            System.out.print(eleman+" ");
        }
//list teki tum elemanlari siliniz
        while (newlist.hasNext()) {
newlist.next();
newlist.remove();
        }
        System.out.println();
        System.out.println(mylist);
        List<String> maylist= new ArrayList<>();
        maylist.add("z");
        maylist.add("k");
        maylist.add("s");
        maylist.add("a");
        maylist.add("m");
        Iterator<String> itr=maylist.iterator(); //iterator da set ve previos yoktur sadece hasNext next ve remove vardir
        while (itr.hasNext()) {
           String el= itr.next();
            System.out.print(el+" ");
        }


    }
}
