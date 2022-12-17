package pratikler;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEnAzKarakter {
    public static void main(String[] args) {
        String names[] = new String[] { "Alis", "Betül", "Cema", "Deniz","Dinazor", "Caney"};
        String kisa=names[0];
        for (int i=1; i<names.length; i++) {
            String w = names[i];
            if (w.length() < kisa.length()) {
                kisa = w;
            }
        }for (String w :names) {
            if (w.length()== kisa.length()) {
                System.out.println(w);

            }
        }


        //2.yol
        Arrays.sort(names, Comparator.comparingInt(String::length));
        System.out.println(names[0]);



    }

}
