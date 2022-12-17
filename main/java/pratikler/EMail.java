package pratikler;

import java.util.Scanner;

public class EMail {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir e mail giriniz");
        String email= scan.nextLine();
        boolean first=email.isBlank();
        int a=email.indexOf("@");
        int b=email.lastIndexOf("@");
boolean second=(a==b);
boolean third=email.contains("@");
if (!first&&second&&third){
    System.out.println("e mail gecerli");
}else {
    System.out.println("e mail bir tane @ icermeli ve bosluktan olusmamalidir");
}




    }
}
