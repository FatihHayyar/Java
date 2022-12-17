package pratikler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ebob ve ekok icin iki sayi girin");
        int a=scan.nextInt();
        int b=scan.nextInt();
      int ebob=1;
for (int i=1;i<a+1&&i<b+1;i++) {
    if (a%i==0&&b%i==0){
       ebob=i;
    }
}System.out.println(ebob);
        int ekok=(a*b)/ebob;
        System.out.println("ekok = " + ekok);



    }
}
