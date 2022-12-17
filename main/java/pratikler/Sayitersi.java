package pratikler;

import java.util.Scanner;

public class Sayitersi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=scan.nextInt();
        String stringcount=String.valueOf(count);
        for(int i=stringcount.length()-1;i>-1;i--) {
            System.out.print("Output :Reverse Of The Number: "+stringcount.substring(i,i+1));
        }
    }
}
