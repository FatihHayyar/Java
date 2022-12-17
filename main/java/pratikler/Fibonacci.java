package pratikler;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kac tane fibonacci sayisi olsun");
        int n=scan.nextInt();
        int fibo1=1;
int fibo2=1;
int toplam=0;
        System.out.print(fibo2+" ");
        System.out.print(fibo1+" ");
        for (int i=1; i<n-1; i++) {
            toplam=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=toplam;
            System.out.print(toplam+" ");
        }
    }
}
