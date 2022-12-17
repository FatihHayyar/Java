package pratikler;

import java.util.Scanner;

public class PerfectSayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        int sum=0;
        for (int i=1; i<sayi; i++) {
            if (sayi%i==0){
                sum=sum+i;
            }
        }
        if (sayi==sum) {
            System.out.println(sayi+" is Perfect Number");
        }else System.out.println(sayi+" is not Perfect Number");










    }
}
