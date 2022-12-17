package pratikler;

import java.util.Scanner;

public class Asalsayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=scan.nextInt();
        int toplam=0;

        for (int i=2; i<num; i++){
            if (num%i==0){
                toplam=toplam+i;
            }

        }if (toplam==0){
            System.out.println("asal sayidir");
        }else System.out.println("asal sayi degildir");
    }
}
