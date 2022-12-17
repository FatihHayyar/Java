package pratikler;

import java.util.Arrays;

public class ArraydanelemancikariparrayYapma {
    public static void main(String[] args) {
int arr[]={-36,48,72,-12,55,-77,-36};
int cikan=-36;
int count=0;
int k=0;
for (int w:arr) {
    if (w ==cikan){
        count++;
    }
}int narr[]=new int[arr.length-count];
        for (int w:arr) {
            if (w !=cikan){
narr[k]=w;
k++;
            } }


        System.out.println(Arrays.toString(narr));


    }
}
