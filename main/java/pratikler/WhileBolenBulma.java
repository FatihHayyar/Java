package pratikler;

import java.util.Scanner;

public class WhileBolenBulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a integer");
        int n=scan.nextInt();
        int i=1;
        int toplam=0;
        while(i<n+1){
            if(n%i==0){
                System.out.print(i+" ");
                toplam=toplam+i;

            }i++;}
        System.out.println();
        System.out.println(toplam);
    }

}
