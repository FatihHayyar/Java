package day15ArraysMultiDiamentialsArrays;

public class Example02 {
    public static void main(String[] args) {
        // bir String multidimentional array de icinde a olan elemanlari yazdirin
//        char multi[][]={{'a','b','c'},{'d','e'},{'f'}};
String multiarr[][]={{"ummu","gulsum"},{"emine","Betul"},{"osman","furkan"},{"fatih","gulsah"}};
for (String[] w:multiarr){
    for (String nma:w){
        if (nma.contains("a")){
            System.out.println(nma+" ");
        }
    }



}


    }
}
