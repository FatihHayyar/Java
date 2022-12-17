package day30collections;

import java.util.LinkedList;
import java.util.Queue;
//ilk giren elemani ilk kullanmaniz gerektiğinde queue secilir
//queue de elemanlara insertion order a gore diziliz
//peek,element ve pool gibi metotlar vardir remove da vardir
public class Queue01 {
    public static void main(String[] args) {
        Queue<String> wareHouse=new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Beards");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);
wareHouse.offer("potatoes");//kapasiteye bakar yer varsa ekler boolean tru atar yer yoksa eklemez false dondurur


    }
}
