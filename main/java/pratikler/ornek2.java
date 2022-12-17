package pratikler;

import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir parola giriniz");
        String parolabir= scan.nextLine();
        System.out.println("lutfen parolanizi tekrar giriniz");
        String parolaiki= scan.nextLine();
if (parolabir.equalsIgnoreCase(parolaiki)){

    System.out.println("giris basarili");

}
else {
    System.out.println("lutfen parolayi dogru giriniz");
}









    }







}
