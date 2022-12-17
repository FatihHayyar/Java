package pratikler;

import java.util.Scanner;

public class AsalSayiWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi yazin");
        int sayi=scan.nextInt();
        int a=2;
        int toplam=0;
        while(a<sayi){
            if (sayi%a==0){
                toplam=toplam+a;

            }a++;
        }if (toplam==0){
            System.out.println("asal sayidir");
        }else System.out.println("asal sayi degildir");





    }
}
