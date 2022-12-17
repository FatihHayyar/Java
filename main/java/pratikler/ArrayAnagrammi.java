package pratikler;

import java.util.Arrays;

public class ArrayAnagrammi {
    public static void main(String[] args) {
        String bir="Nazmiye";
        String iki="Nizamey";
        String birarr[]=bir.toLowerCase().split("");
        String ikiarr[]=iki.toLowerCase().split("");
        Arrays.sort(birarr);
        Arrays.sort(ikiarr);
        if (Arrays.equals(birarr, ikiarr)) {
            System.out.println("Anagramdir");

        }else System.out.println("Anagram degildir");

    }
}
