package day16MultiDimentionalsArrayList;

import java.util.Arrays;

public class Multi2 {
    public static void main(String[] args) {
        //multiyi arraya cevirin
        int multi[][]={{3,5,7},{9,11},{13,15,17,19}};
        int length=0;
        for (int[]w:multi){
            length=length+w.length;
        }
        int idx=0;
        int multiyeni[]=new int[length];
        for (int[]w:multi){
            for (int k:w){
                multiyeni[idx]=k;
                idx++;
            }
        }

        System.out.println(Arrays.toString(multiyeni));


    }
}
