package day32maps;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {
        //size verilen kelimedeki harflerin kacar defa kullanildigini bulun
        String str="Alabama";
        String str1[]=str.split("");
//2. yol
        HashMap<String,Integer> harfsay1= new HashMap<>();
        for (String k:str1){
            Integer grn=harfsay1.get(k);
            if (grn==null){
                harfsay1.put(k,1);

            }else {
                harfsay1.put(k,grn+1);
            }
        }
        System.out.println(harfsay1);

    }

}
