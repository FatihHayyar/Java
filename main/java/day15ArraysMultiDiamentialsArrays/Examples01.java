package day15ArraysMultiDiamentialsArrays;

public class Examples01 {
    public static void main(String[] args) {
        //   Strin bir multi dimentional array olusturun ve toplam eleman sayisini ekrasna yazdirin
   String str[][]={{"Osman","Furkan"},{"Ummu","Gulsum"},{"Emine","Betul"},{"Fatih","gulsah"}};
   int count=0;
for (String[] w:str){

        count=count+w.length;

    }
        System.out.println(count);
}
}