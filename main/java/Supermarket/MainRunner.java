package Supermarket;

import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int snc=0;
        Attemps urunler= new Attemps();

        while (snc != 4) {
            System.out.println("Hangi islemi yapmak istiyorsunuz?\nUrun Listeleme\t\t\t:1" +
                    "\nYeni urun girisi\t\t:2\nUrun Bilgisi guncelle   :3\nCikis yap\t\t\t    :4");
          snc = scan.nextInt();
            if (snc != 1 && snc != 2 && snc != 3 && snc != 4) {
                System.out.println("gecerli bir deger giriniz");
            }
            else if (snc==1){

urunler.Listeleme();

                System.out.println();
                System.out.println("baska islem yapmak istiyormusunuz? Y/N");
                String ch=scan.next().toLowerCase();
                if (ch.equals("n")||!ch.equals("y")){
                    break;
                }
            }else if (snc==2){

urunler.yeniurungirisi();
                System.out.println();
                System.out.println("baska islem yapmak istiyormusunuz? Y/N");
                String ch=scan.next().toLowerCase();
                if (ch.equals("n")||!ch.equals("y")){
                    break;
                }
            }
            else if(snc==3){
                urunler.degistirme();
                System.out.println();
                System.out.println("baska islem yapmak istiyormusunuz? Y/N");
                String ch=scan.next().toLowerCase();
                if (ch.equals("n")||!ch.equals("y")){
                    break;
                }
            }

        }
    }
}