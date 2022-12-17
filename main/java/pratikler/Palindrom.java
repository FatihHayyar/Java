package pratikler;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner unit= new Scanner(System.in);
        System.out.println("bir Palindrom kelime girin ");
String wort= unit.nextLine();
        String a="";
for (int i=0; i<wort.length(); i++) {
    String harf=wort.substring(wort.length() -1- i,wort.length() -i);
    a=a+harf;
}
        if (a.equals(wort)) {
            System.out.println("Palindromdur");
        }else System.out.println("palindrom degildir");

    }
}



