package day17ArraysLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {
        //verilen bir list deki elemanlari tekrarsiz yazin
        List<Integer> numbers= new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(2);
        numbers.add(5);
        List<Integer> nnumber= new ArrayList<>();
        for(int w:numbers){
            if(!nnumber.contains(w)){
                nnumber.add(w);
            }
        }
        System.out.println(nnumber);






    }
}
