package pratikler;

import java.util.Scanner;

public class KelimeIciHarfSayma {
    public static void main(String[] args) {


            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a word");
            String word=scan.nextLine();
            System.out.println("Enter a charachter");
           String ch=scan.next();
            String box="";
            for (int i=0;i<word.length();i++){
                String a=word.substring(i,i+1);
                if(!ch.equals(a)){
                    box=box+a;
                }
            }System.out.println("Number of "+ch+"="+(word.length()-box.length()));


        }
    }


