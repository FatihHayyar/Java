package pratikler;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of armstrong: ");
        int n=scan.nextInt();
        int ilkn=n;
        int toplam=0;
        for (; n>0; n=n/10) {

            toplam=toplam+(n%10)*(n%10)*(n%10);

        } System.out.println(toplam);
        if (toplam==ilkn){

            System.out.println("Armstrong sayisidir");
        }else System.out.println("Armstrong sayisi degildir");

    }
}
