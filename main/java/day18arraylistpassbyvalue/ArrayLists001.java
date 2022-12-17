package day18arraylistpassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists001 {
    public static void main(String[] args) {
//bir integer list teki 7 haric tum elemanlari 2 arttiriniz
        List<Integer> array = new ArrayList<>();
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        for (int w:array){
            if (w==7){
                continue;
            }else System.out.println(w+2+" ");




            }
        }


    }

