package pratikler;


import java.util.Scanner;

public class KacTaneAVar {
    public static void main(String[] args) {

        Scanner unit=new Scanner(System.in);
        System.out.println("Tam isminizi giriniz");
        String a= unit.nextLine();
        System.out.println("bir karakter giriniz");
char b=unit.next().charAt(0);
int sum=0;
for (int i=0; i<a.length(); i++){
    if (a.charAt(i) == b){
        sum++;
    }
}
        System.out.println(sum);



    }
}
