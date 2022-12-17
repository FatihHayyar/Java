package day15ArraysMultiDiamentialsArrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Binarysearch() metot
        //Bu metotla bir elemanin array de olup olmadigini anlariz. bu metot icin once sort yapilir
        //aradigimiz eleman varsa o elemanin indexini return eder.
        //yoksa "-" gorursunuz. sayi ise olsaydi nerde olurdu
        //2 tane olursa ilkini gosterir NOt: Kullanilmaz tekrarlilarda hata verebilir
int arr[]={12,31,43,14,31};
int sayi=31;
        Arrays.sort(arr);

int kac=Arrays.binarySearch(arr, sayi);
        System.out.println(kac);


    }
}
