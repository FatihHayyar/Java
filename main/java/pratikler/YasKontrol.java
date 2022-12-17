package pratikler;

import java.util.Scanner;

public class YasKontrol {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        if (yas>17){
            System.out.println("resitsin");
        }
else {
    int fark=18-yas;
            System.out.println(fark+" yil sonra resit olacaksin");
        }
    }
}
