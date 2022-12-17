package smallStudy;

import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double count=Math.random();
       count=count*100;
       long sistmesayi=Math.round(count);
       System.out.println(sistmesayi);
        System.out.println("Sayi tahmin yarismasina hosgeldiniz...");
        System.out.println("Toplam 5 tahmin hakkiniz vardir");
int counter=5;
boolean sonuc=false;
        for(int i=1;i<counter+1;i++){
            System.out.println(i+". tahmini girin");
            int tahmin=scan.nextInt();
            if (tahmin==sistmesayi){
                sonuc=true;
                break;
            }else System.out.println("yanlis cevap");
        }if (sonuc){
            System.out.println("tebrikler... Kazandiniz");
        }

    }
}
