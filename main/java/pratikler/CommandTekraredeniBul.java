package pratikler;

import java.util.Scanner;

public class CommandTekraredeniBul {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write a letter");
        String name=scan.next();
        String box="";
        for (int i=0; i<name.length(); i++) {
            String a=name.substring(i,i+1);
            if (name.indexOf(a)!=name.lastIndexOf(a)){
                if (!box.contains(a)){
                box=box+a;}
            }
        }
        System.out.println(box);







    }
}
