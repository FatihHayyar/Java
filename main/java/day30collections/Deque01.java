package day30collections;

import java.util.Deque;
import java.util.LinkedList;

//Deque double ended queue demektir. iki uclu queue yani
//Fifo ve lifo beraber gerektiğinde kullanilir
public class Deque01 {
    public static void main(String[] args) {

        Deque<String> furnitureTruck=new LinkedList<>();
        furnitureTruck.add("“Chair”");
        furnitureTruck.add("“Mirror”");
        furnitureTruck.add("“Sofa”");
        furnitureTruck.add("“Bed”");
        furnitureTruck.add("“Bed”");
        furnitureTruck.add("“Bed”");
        furnitureTruck.add("“Dining Table”");
        System.out.println(furnitureTruck);
furnitureTruck.push("Chair");//addfirst le ayni kapasiteye bakar yer varsa ekler yoksssa hata verir
        System.out.println(furnitureTruck);
    }
}
