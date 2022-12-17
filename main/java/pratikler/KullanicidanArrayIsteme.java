package pratikler;

import java.util.Arrays;
import java.util.Scanner;

public class KullanicidanArrayIsteme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Array uzunlugunu giriiniz");
        int length=scan.nextInt();
        int array[]=new int[length];
        for(int i=0;i<length;i++){
            System.out.println(i+". array elemanini giriniz");
            array[i]=scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array[array.length-1]-array[0]);





    }
}
