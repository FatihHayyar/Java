package pratikler;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sinav sonucunu giriniz");
        int a= scan.nextInt();
        if (a<50&&a>-1){
            System.out.println("Basarisiz");
        }
        else if (a>50&&a<70){
            System.out.println("C");
        }
        else if (a>70&&a<85){
            System.out.println("B");
        }
        else if (a>85&&a<101){
            System.out.println("A");
        }
        else {
            System.out.println("0 ile 100 arasi gecerli bir not giriniz");
        }

    }




}
