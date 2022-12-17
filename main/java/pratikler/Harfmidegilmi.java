package pratikler;

import java.util.Scanner;

public class Harfmidegilmi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char harfmi=scan.next().charAt(0);
int harf=harfmi;
if(harf>64&&harf<123){
    System.out.println("girdiginiz karakter bir harftir");
}
else {
    System.out.println("girdiginiz karakter bir harf degildir");
}
    }
}
