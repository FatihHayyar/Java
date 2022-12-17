package pratikler;

import java.util.Arrays;

public class Arrayenkucukbuyuk {
    public static void main(String[] args) {
        int sayilar[]=new int[]{-36,48,72,-12,55,-77};
        Arrays.sort(sayilar);
        System.out.println("en buyuk sayi="+sayilar[sayilar.length-1]);
        System.out.println("en kucuk sayi="+sayilar[0]);
        int pozkucuk=sayilar[sayilar.length-1];
        int negbuyuk=sayilar[0];
        for (int w:sayilar) {
            if (w>0){
                pozkucuk=Math.min(pozkucuk,w);
            }
        }for (int w:sayilar) {
            if (w<0){
                negbuyuk=Math.max(negbuyuk,w);
            }
        }
        System.out.println("en kucuk pozitif sayi= "+pozkucuk);
        System.out.println("en buyuk negatif sayi= "+negbuyuk);






    }
}
