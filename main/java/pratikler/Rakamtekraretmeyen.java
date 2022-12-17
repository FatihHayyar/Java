package pratikler;

import java.util.Scanner;

public class Rakamtekraretmeyen {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi yaziniz");
        String count= scan.next();
        String neu="";
        for(int i=0;i<count.length();i++){
            String c=count.substring(i,i+1);
            if(count.indexOf(c)==count.lastIndexOf(c)){
                neu=neu+c;
            }

        }System.out.println(neu);
    }
}
