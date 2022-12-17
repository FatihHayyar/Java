package day32maps;

import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {
        //size verilen bir cumledeki bir kelimenin kac kere yazildigini bulu
        String str=" i like to move it, move it.";
        String newstr=str.replaceAll("\\p{Punct}","").trim();
        String sewstrr[]=newstr.split(" ");
        int i=1;
        HashMap<String,Integer> snc = new HashMap<>();
        for(String w:sewstrr){
            i=1;
            if (snc.containsKey(w)){
                i++;
            }
            snc.put(w,i);
        }
        System.out.println(snc);
    }
}
