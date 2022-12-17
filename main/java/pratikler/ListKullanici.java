package pratikler;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ListKullanici {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(10);
        mylist.add(31);
        mylist.add(15);
        mylist.add(13);
        mylist.add(54);

        for (int i=0; i< mylist.size(); i++) {
            if (mylist.get(i) == 13) {
                mylist.remove(i);
            }
        }for (int i=0; i< mylist.size(); i++) {
            if (mylist.get(i) == 15) {
                mylist.remove(i);
            }}

        System.out.println(mylist);







    }
    }

