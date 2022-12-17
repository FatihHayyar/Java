package day16MultiDimentionalsArrayList;

import java.util.Arrays;

public class multi03 {
    public static void main(String[] args) {
        //bir multideki en buyuk ve en kucugun toplamini bulun
        int multi[][]={{3,5,7},{9,11},{13,15,17,19}};

        int length=0;
        for (int[]w:multi) {
           length=length+w.length;
        }
        int ind=0;
int newarr[]=new int[length];
        for (int []w:multi) {
            for(int k:w){
                newarr[ind]=k;
                ind++;
            }
        }
        Arrays.sort(newarr);
        System.out.println("en kucuk "+newarr[0]);
        System.out.println("en buyuk "+newarr[newarr.length-1]);

        //2.yol
        int max=multi[0][0];
        int min=multi[0][0];
        for (int[]w:multi) {
            for(int k:w){
                max=Math.max(max,k);
                min=Math.min(min,k);

            }
        }
        System.out.println(max+min);
    }
}
