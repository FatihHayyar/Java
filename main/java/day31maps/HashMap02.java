package day31maps;

import java.util.HashMap;
/* 1 bu kod yazildiginda java memory de 16 kutu (backet) iceren bir yapi olusturur ve bu yapidaki herbir
kutuya indeks verir indeksler 0 dan 15 e kadardir
2.kod yazildiginda java key icin bir hashkod olusturur bu hashkodu 15 e boler ve kalani indeks olarak kullanir
ve bu elemani o indekse yerlesirir. yerlestirirken 4 lu bir yapi olusturur. bu yapinin ilk bolumune
hashkodu 2. bolumune key 3. bolumune valueyu 4. bolumune pointeri koyar. bu cok bolumlu yapi linkedlistteki
node dur. yani hashmap backed lara koydugu datayi linkedlist olarak depolar.
3. key     null oldugunda eleman ilk bucket a yerlestirilir bundan dolayi key i null olanlar map te genel
likle ilk sirada gozukurler
4.java normalde hashkod lari unique yapar ama bazen trafik kazasi gibi ayni uretilebilir
buna Hashcollision denir. cok meshurdur. ama cok karsilasilmaz. karsilasildiginda developer lar
bunu cozmek icin kod yazarlar
 */
public class HashMap02 {
    public static void main(String[] args) {
        HashMap<String,Double> salaries=new HashMap<>();
        salaries.put("QA",110000.00);
        salaries.put("DEV",130000.00);



    }

}
