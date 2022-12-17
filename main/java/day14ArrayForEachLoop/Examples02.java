package day14ArrayForEachLoop;

import java.util.Arrays;
import java.util.Comparator;

public class Examples02 {
    public static void main(String[] args) {
        //verilen cumledeki en uzun kelime
        String str="java kolaydir calisana, ne kolaydir ki calismayana";
        String[] strArray = str.replaceAll("\\p{Punct}","").split(" ");
        String buyuk=strArray[0];
        for (String w:strArray){
            if (w.length()>buyuk.length()){
                buyuk=w;
            }
        }//2.cozum
        System.out.println(buyuk);
        Arrays.sort(strArray, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(strArray));
    }
}
