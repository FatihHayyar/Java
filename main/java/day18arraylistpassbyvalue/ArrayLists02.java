package day18arraylistpassbyvalue;

import java.util.ArrayList;
import java.util.List;
//size verilen listede 8 ve oncesini alin
public class ArrayLists02 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
for (int w:array){

array.set(array.indexOf(w),w*2);
    if (w==8){
        break;
    }

}
        System.out.println(array);




    }
}
