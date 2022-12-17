package pratikler;

import java.util.Arrays;

public class AIleBaslayansSayi {
    public static void main(String[] args) {
        String s="Anlayana sivrisinek saz, anlamayana davul zurna az.";
        String news=s.replaceAll("\\p{Punct}","");
        String satz[]=news.split(" ");
        System.out.println(Arrays.toString(satz));
        for (String w:satz) {
            if(w.startsWith("A")||w.startsWith("a")){
                System.out.println(w);
            }



        }


    }
}
