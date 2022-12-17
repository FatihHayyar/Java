package pratikler;

import java.util.Scanner;

public class Manipulations02 {
    public static void main(String[] args) {
        Scanner unit=new Scanner(System.in);
        System.out.println("tam isminizi girin");
        String tamisim= unit.nextLine();
        int karsay=tamisim.replace(" ","").length();
        System.out.println(karsay>9 ? "ismin uzun":"ismin normal");



    }
}
