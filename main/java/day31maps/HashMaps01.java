package day31maps;

import java.util.HashMap;
import java.util.Map;

//metodun sol tarafina key, sag tarafina value denir.;Map ler key value kullanilir.
//Maplar key value srtuctor ini kullanirlar.
//Map lerde key kismi tekrarsiz data icerir(unique)
// value kismi unique olmak zorunda degildir.
//coklu datalari depolarken ,bir tane deger depoluyorduk. Oysa burada iki deger var.(key,value)
//  bu iki deger depolamaya entry demisler
//mapler hakkinda konusurken eleman demeyin,map in 2 tane entry set i var
//Hashmap ler entry set leri siralamakla ugrasmazlar,nicin cunku ,
// siralama zaman ister.bu yuzden hashmap ler superfasttir.
public class HashMaps01 {
    public static void main(String[] args) {
        HashMap<String,Integer> studentNameAge=new HashMap<>();
        studentNameAge.put("Aali",30);
        studentNameAge.put("Hasan",28);
        studentNameAge.put("Ayse",34);
        studentNameAge.put("Aali",24);//Hata vermez override yapar
        studentNameAge.put(null,36);
        studentNameAge.put("sadri",null);
        System.out.println(studentNameAge);
        //map den sadece key ler nasil alinir
        System.out.println(studentNameAge.keySet());
       //map den value alma
        System.out.println(studentNameAge.values());
        //belli bir key e ait value alalim
        System.out.println(studentNameAge.get("Ayse"));
        //tum integer yaslarin ortalamasini hesaplayin
        int top=0;
        int counter=0;
        for(Integer w:studentNameAge.values()){

                if (w != null) {
                    top += w;
                    counter++;
                }

        }
        double ort=top/counter;
        System.out.println(ort);
        //Example 2: A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz.
        int toppp=0;
        for (String w:studentNameAge.keySet()){

            if(w!=null&&!w.startsWith("A")){
                toppp+=w.length();
            }
        }
        System.out.println(toppp);

        studentNameAge.remove(null,36); //key ve value girerek sildik farkli olsaydi silmezdi
        System.out.println(studentNameAge);
        studentNameAge.remove("Aali");//hepsini silerr istersek value bize verir
        System.out.println(studentNameAge);
        //key varsa value sini ver yoksa bir mesaj ver
        System.out.println(studentNameAge.getOrDefault("Ayse", 30));
//value null ise ekleme yap degilse ekleme yapma
        studentNameAge.putIfAbsent("Fatih",36);
        System.out.println(studentNameAge);
        //value yi guncellemek icin
        studentNameAge.replace("Fatih",34);
        System.out.println(studentNameAge);
        //value yi eski degeri girerek degistirme
        studentNameAge.replace("Fatih",34,35);
        System.out.println(studentNameAge);
        //map teki her bir entry i ekrana farkli bir satirda olacak sekilde yazin
        for (Map.Entry<String, Integer> w:studentNameAge.entrySet()){
            System.out.println(w);
        }
    }

}
