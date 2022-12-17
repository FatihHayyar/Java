package pratikler;

import java.util.Scanner;

public class BankaIsimGizleme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write Your name");
        String name=scan.next();
        System.out.println("Write Your surname");
        String surname=scan.next();
        System.out.println("Write Your Kredit Karte Nummer");
        String nummer=scan.next();
        String b="";
        String c="";
        String d="";
        if (nummer.length()!=16){
            System.out.println("Invalid credit card number");
        }else{
            for (int i=1;i<name.length();i++){
                b=b+"*";}
            for (int j=1;j<surname.length();j++){
                c=c+"*";}
            for (int k=1;k<nummer.length()-4;k++){
                d=d+"*";}
            String newname=name.substring(0,1)+b;
            String newsurname=name.substring(0,1)+c;
            String newnummer=d+nummer.substring(nummer.length()-4);
            System.out.println("Name:"+newname+" "+newsurname);
            System.out.println("CCV:"+newnummer);}

    }
    }

