package day32maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap02 {
    //TreeMaplar entryset leri kay lara gore natural order da siralar(alfabetik ve kucukten buyuge)
    //en yavas maptir
    //Thread safe sencronized degildir.
    public static void main(String[] args) {
        TreeMap<String,Double> salaries=new TreeMap<>();
        salaries.put("Tom Hanks",3000.0);
        salaries.put("Mary Stars",1000.0);
        salaries.put("Jimmy Johns",5000.0);
        salaries.put("Curly Johnson",6000.0);
        System.out.println(salaries);

        SortedMap<String,Double> mapp= salaries.tailMap("Mary");
        System.out.println(mapp);//yazdigimiz key dan gerisini yazdirir

        NavigableMap<String,Double> mapp2= salaries.tailMap("Mary Stars",false);
        System.out.println(mapp2);//verdigimiz key i alsin mi almasin mi

        NavigableMap<String,Double> mapp3= salaries.subMap("Mary",true,"Tom Hanks",false);
        System.out.println(mapp3);//istegimi yeri almak icin

        Map.Entry<String,Double> map4=salaries.lowerEntry("Mary");
        System.out.println(map4);//yazdigimdan oncekini veriri olmayan birimi yazarsak eger olsaydi ondan oncesini verirdi

        Map.Entry<String,Double> map5=salaries.higherEntry("Mary Stars");
        System.out.println(map5);//yazdigimizdan sonrakini verir

        Map.Entry<String,Double> map6= salaries.ceilingEntry("Mary Stars");
        System.out.println(map6); //varsa aynisini yoksa bir sonrakini yazdirir

        Map.Entry<String,Double> map7= salaries.floorEntry("Mary Stars");
        System.out.println(map7);//varsa aynisini yoksa bir oncekini yazdirir






    }

}
