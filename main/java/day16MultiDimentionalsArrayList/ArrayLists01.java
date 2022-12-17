package day16MultiDimentionalsArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        //Array lists ler ayni data tipine sahip birden fazla data tipini depolamak icin kullanilir.
        //
/*1.Array da en basta lengthini en basta veririz ve degistiemeyiz. elman sayisi fix dir
Arraylists de ise eleman sayisi söylemeye gerek yok. flexible dir
2. array larin icine primitive ve reference ler konulabilir.
Arraylists lere ise sadece non primitiveler konulabilir
3. array superfast tir. memory i cok az kullanir.
Not: bu yuzden elemaan sayisi kesin belli ise array kullaniriz.
 */
        ArrayList<Integer> ages = new ArrayList<Integer>();
//2.yol
        ArrayList<Integer> yas = new ArrayList<>();
        yas.add(1);
        yas.add(2);
        //3.yol
        List<Integer> nums = new ArrayList<>();
        //nasil yazdirilir
        System.out.println(nums);
        //nasil eleman eklenir
        nums.add(21);
        nums.add(18);//herzaman en sona ekler.(insertion order)
        nums.add(20);
        System.out.println(nums);
        nums.add(1, 50);//istedigimiz yere koyduk
        System.out.println(nums);
        nums.addAll(yas);//List in icine list koyduk. nums a yas in elemanlarini girdik
        System.out.println(nums);
nums.addAll(2,yas);//list in icinde istedigimiz yere liste de ekleyebiliriz
        System.out.println(nums);
int sayi=nums.size();//list in eleman sayisini verir
        System.out.println(sayi);
//list de herhangi bir eleman secme
        int secme=nums.get(4);
        System.out.println(secme);
//list in bos olup olmadigini
boolean bosmu=nums.isEmpty();
        System.out.println(bosmu);
//list de eleman degistirme degistirmek istenen index ve yeni sayi
        nums.set(2,36);
        System.out.println(nums);
//list den eleman silme
        Integer says=2;
        nums.remove(says); //direkt yazilmaz once wrapper classa cevrilir. Ilk elemani siler.2. kalir
        System.out.println(nums);



    }
}
