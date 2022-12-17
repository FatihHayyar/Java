package pratikler;

import java.util.Scanner;

public class WhileRakamToplam {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter an integer");
        int n=scan.nextInt();
        int toplam=0;
        while(n>0){
            toplam=toplam+n%10;
            n=n/10;
        }
        System.out.println(toplam);




    }

}
