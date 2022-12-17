package pratikler;

import java.util.Scanner;

public class Emeklilik {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi girin");
        int yas= scan.nextInt();
        if (yas>64){
            System.out.println("emekli olabilirsin");
        } else if (yas<65&&0<yas) {
            System.out.println((65-yas)+" yildaha calismalisin");
        }
else System.out.println("gecerli bir yas giriniz");

    }
}
