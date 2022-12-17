package day15ArraysMultiDiamentialsArrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //verilen bir integer array daki pozitif ve negatif iceren en büyük negatif ve
        // enkucuk pozitifi bulunuz
        //Math.max ve Math.min ile 2 degerden buyuk ve kucuk olan secilebilir
        int arr[] = {-12, 18, -5, 0, 23, -2};
        Arrays.sort(arr);
        int pozitif = arr[arr.length - 1], negatif = arr[0];
        for (int w : arr) {
            if (w > 0 && w < pozitif) {
                pozitif = w;
            }else if (w < 0 && w > negatif) {
                negatif = w;
            }

        }
        System.out.println(pozitif+" "+negatif);
    }
}