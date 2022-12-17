package day14ArrayForEachLoop;

public class Examples {
    public static void main(String[] args) {
        //dizi icinde eleman varmi
        String str[]={"ali","hasan","Huseyin","ali"};
        int count=0;
        for(String w:str){
            if(w.equals("ali")){
                count++;

            }
        }if(count>0){
        System.out.println("ali "+count+" kere var");}
else System.out.println("ali arrayda yok");


    }
}
