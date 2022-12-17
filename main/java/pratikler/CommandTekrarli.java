package pratikler;

import java.util.Scanner;

public class CommandTekrarli {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a name, the length of name should be 3");
        String name=scan.next();
        if (name.replace(name.substring(0,1),"").length()==2&&name.replace(name.substring(1,2),"").length()==2){
            System.out.println("String has unique characters");
        }else System.out.println("String has duplicate characters");


    }
}
