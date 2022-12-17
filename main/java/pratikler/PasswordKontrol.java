package pratikler;

import java.util.Scanner;

public class PasswordKontrol {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Kurallara uygun password giriniz");
        String satz=scan.nextLine();
       boolean first=satz.length()>7;
       boolean second=!satz.contains(" ");
       boolean third=!satz.contains("[A-Z]");
       boolean fourth=satz.endsWith(".");
        System.out.println(first+" "+second+" "+third+" "+ fourth);
       if(first&&second&&third&&fourth){
           System.out.println("sifre gecerli");
       }else System.out.println("kurallara uygun password yazin");

 /*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

*/



    }



}
