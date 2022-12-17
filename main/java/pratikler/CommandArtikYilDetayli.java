package pratikler;

import java.util.Scanner;

public class CommandArtikYilDetayli {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ay ve yili girin");
        int ay=scan.nextInt();
        int year=scan.nextInt();
        String ayadi;
        switch (ay) {
            case 1:
                ayadi="Ocak";
                System.out.println(ayadi+" "+year+" has 31 days");
                break;
            case 2:
                ayadi="Subat";
                if(year%100==0){
                    if (year%400==0){
                        System.out.println(ayadi+" "+year+" has 29 days");
                    }else System.out.println(ayadi+" "+year+" has 28 days");
                }else {
                    if (year%4==0){
                        System.out.println(ayadi+" "+year+" has 29 days");;
                    }else System.out.println(ayadi+" "+year+" has 28 days");
                }
                break;
            case 3:
                ayadi="Mart";
                System.out.println(ayadi+" "+year+" has 31 days");
                break;
            case 4:
                ayadi="Nisan";
                System.out.println(ayadi+" "+year+" has 30 days");
                break;
            case 5:
                ayadi="Mayis";
                System.out.println(ayadi+" "+year+" has 31 days");
                break;
            case 6:
                ayadi="Haziran";
                System.out.println(ayadi+" "+year+" has 30 days");
                break;
            case 7:
                ayadi="Temmuz";
                System.out.println(ayadi+" "+year+" has 31 days");
                break;
            case 8:
                ayadi="Agustos";
                System.out.println(ayadi+" "+year+" has 31 days");
                break;
            case 9:
                ayadi="Eylul";
                System.out.println(ayadi+" "+year+" has 30 days");
                break;
            case 10:
                ayadi="Ekim";
                System.out.println(ayadi+" "+year+" has 31 days");
                break;
            case 11:
                ayadi="Kasim";
                System.out.println(ayadi+" "+year+" has 30 days");
                break;
            case 12:
                ayadi="Aralik";
                System.out.println(ayadi+" "+year+" has 31 days");
                break;
        }







    }
}
