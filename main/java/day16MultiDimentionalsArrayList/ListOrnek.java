package day16MultiDimentionalsArrayList;

import java.util.*;

public class ListOrnek {
    public static void main(String[] args) {
        // bir list deki tum tek sayilari 11 arttirdiktan sonra ekrana yazdirin
        List<Integer> nums = new ArrayList<>();
        nums.add(21);
        nums.add(50);
        nums.add(36);
        nums.add(2);
        nums.add(18);
        nums.add(20);
        nums.add(1);
        nums.add(2);
        int degsay=0;
        for (int w:nums){
            if (w%2!=0){
               nums.set(nums.indexOf(w),w+11);
                System.out.print(w+11+" ");
            }
        }
        System.out.println();
        System.out.println(nums);





    }
}
