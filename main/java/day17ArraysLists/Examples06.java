package day17ArraysLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Examples06 {
    public static void main(String[] args) {
//bir list teki elemanlardan birbirine en yakin olani bulun
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(15);
        nums.add(19);
        nums.add(30);
        nums.add(21);
        Collections.sort(nums);
        int minfark=Integer.MAX_VALUE;
       for (int i = 1; i < nums.size(); i++){
minfark = Math.min(minfark,nums.get(i)-nums.get(i-1));
       }
        for (int i = 1; i < nums.size(); i++){
            if (nums.get(i)-nums.get(i-1)==minfark){

                System.out.println("bu sayilar: "+nums.get(i)+" ve "+nums.get(i-1));
            }

        }

    }
}
