package day17ArraysLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrrayList {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> sayilar=new ArrayList<Integer>();
        System.out.println("listeye bir sayi ekleyin");
        int sayi= scan.nextInt();
        sayilar.add(sayi);
        System.out.println("listeye bir sayi ekleyin");
        int sayi1= scan.nextInt();
        sayilar.add(sayi1);
        System.out.println("listeye bir sayi ekleyin");
        int sayi2= scan.nextInt();
        sayilar.add(sayi2);
        System.out.println("Listeniz: "+sayilar);
        System.out.println("listeye sayi eklemek istiyormusunuz");
        String a= scan.next();
        if (a.equalsIgnoreCase("evet")){
            System.out.println("lutfen girmek istediginiz sayiyi yazin");
            int sayi3= scan.nextInt();
            sayilar.add(sayi3);
            System.out.println("Listeniz: "+sayilar);
        }else{
            System.out.println("Listeniz: "+sayilar);
        }
        System.out.println("listeden sayi cikarmak istiyormusunuz");
        String b= scan.next();
        if (b.equalsIgnoreCase("evet")){
            System.out.println("kacinci sayiyi cikarmak istiyorsunuz");
            int cikansayi= scan.nextInt();

            switch (cikansayi){
                case 1:
                sayilar.remove(sayi);
                System.out.println("Listeniz: "+sayilar);
                break;
                case 2:
                    sayilar.remove(sayi1);
                    System.out.println("Listeniz: "+sayilar);
                    break;
                case 3:
                    sayilar.remove(sayi2);
                    System.out.println("Listeniz: "+sayilar);
                    break;
                default:
                    System.out.println("gecerli bir sayi girin");
            }


        }else {
            System.out.println("Listeniz: "+sayilar);
        }
        System.out.println("listeden sayi degistirmek istiyormusunuz");
        String c= scan.next();
        if (c.equalsIgnoreCase("evet")){
            System.out.println("hangi sayiyi degistirmek istiyorsunuz");
            int degisensayi= scan.nextInt();
            sayilar.remove(degisensayi);
            System.out.println("hangi sayiyla degismek istiyorsunuz");
            int yenisayi= scan.nextInt();
            sayilar.add(yenisayi);
        }else {
            System.out.println("Listeniz: "+sayilar);
        }

    }
}
