package day14ArrayForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //Arrayslarin icine primitive data typeleri ve reference ler yerlestirilir

//soru: String bir array yapin.tom dan onceki tum elemanlari ve tom u yazdirin
        String str[]=new String[]{"Ceyn", "Mark", "Christoffer", "Tom", "Ali","Rojda"};
//        for (String w:str) {
//            System.out.print(w+" ");
//
//            if (w.equals("Tom")){
//            break;
//        } }
//String bir array olusturun tom ve ceyn haricindekileri yazdirim
        for (String w:str) {
            if (w.equals("Ceyn") || w.equals("Tom")){
                continue;
            }
            System.out.print(w+" ");
        }
        System.out.println();
        //Kullanici ile beraber array olusturun
        //bir ogrencinin ogrenci iismlerini aplikasyona yukleyen programi yazin
        Scanner scan=new Scanner(System.in);
        System.out.println("kac ogrenci var" );
        int total=scan.nextInt();
        String ogrenciler[]=new String[total];
        for (int i=1;i<=total;i++){

            System.out.println(i+". ogrencinin adini girin");
            System.out.println("kayittan cikmak icin q ya basin");
            String names=scan.next();

            if(names.equals("q")||names.equals("Q")){
                break;
            }ogrenciler[i-1]=names;
        }
        System.out.println(Arrays.toString(ogrenciler));

    }
}
