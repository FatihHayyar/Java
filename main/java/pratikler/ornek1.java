package pratikler;

import java.util.Scanner;

public class ornek1 {
    public static void main(String[] args) {
        //Soru: Kullanicidan "isim - soyisim" ve "dogum tarihi" bilgisi alip asagidaki kurallara uygun 8 haneli bir parola olusturun?
        //(Parola="ismin ilk 2 harfi" + "soyismin ilk 2 harfi" + "Dogumtarihi" olacak sekilde )
        Scanner scan=new Scanner(System.in);
        System.out.println("tam isminizi girin");
        String tamisim=scan.nextLine();

        char isimilk =tamisim.charAt(0);
        char isimiki =tamisim.charAt(1);
        char soyilk=tamisim.split(" ")[1].charAt(0);

        char soyiki=tamisim.split(" ")[1].charAt(1);
        System.out.println("Dogum tarihini giriniz");
        String dtarih=scan.next();
        System.out.println("Parola = " +isimilk+isimiki+soyilk+soyiki+dtarih);















    }
}
