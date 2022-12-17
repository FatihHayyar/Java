package day17ArraysLists;

import java.util.ArrayList;
import java.util.List;

public class Arrayslists01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
names.add("Hasan");
names.add("Hayati");
names.add("Huseyin");
names.add("Hakki");
        List<String> cities = new ArrayList<>();
        cities.add("Antalya");
        cities.add("Ankara");
        cities.add("Antep");
        cities.add("Hakki");
names.removeAll(cities); //toplu cikarma islemi
        System.out.println(names);




    }

}
