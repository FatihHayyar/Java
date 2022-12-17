package pratikler;

import java.util.Arrays;

public class Sifirlarsona {
    public static void main(String[] args) {
        int counts[]=new int[]{0,2,3,0,12,0};
        int newcount[]=new int[counts.length];
        int i=0;
        int k=counts.length-1;
        for(int w:counts){
            if (w>0){
                newcount[i]=w;
                i++;
            }else {
                newcount[k]=w;
                k--;
            }
        }
        System.out.println(Arrays.toString(newcount));



    }
}
