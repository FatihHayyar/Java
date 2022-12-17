package pratikler;

import java.util.Arrays;

public class ArrayortancaSayi {
    public static void main(String[] args) {
int a[]=new int[]{12,24,18,36,20,28};
        Arrays.sort(a);
        if (a.length%2!=0){

            System.out.println(a[a.length/2]);
        }int ilk=a[a.length/2];
        int iki=a[a.length/2-1];
        System.out.println((ilk+iki)/2);




    }
}
