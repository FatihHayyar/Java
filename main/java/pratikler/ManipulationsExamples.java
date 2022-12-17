package pratikler;

import java.util.Scanner;

public class ManipulationsExamples {
    public static void main(String[] args) {
        Scanner unit=new Scanner(System.in);
        System.out.println("Isminizi girin");
        String dyazim= unit.next();
         String kuralli=dyazim.substring(0,1).toUpperCase()+dyazim.substring(1,dyazim.length()).toLowerCase();
        System.out.println("dyazim = " + kuralli);





    }
}
