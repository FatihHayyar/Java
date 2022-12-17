package day26Exceptions;

public class Exceptions03 {
    public static void main(String[] args) {
String name="ali";
double c=findStringlength(name);
        System.out.println(c);
        double d=divideStringByTheNumOfTheCharacter(name);
        System.out.println(d);
//String'deki character sayisini bulunuz,
// String'i integer'a ceviriniz, Integer'i character sayisina bolunuz.
    }public static double findStringlength(String str) {
        int b=0;
        try {
            int lenght = str.length();//nullpointer exception
            int a=Integer.valueOf(str);//Numberformat Exception
             b=a/lenght; //ArithmeticException
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        return  b;
    }
    public static double divideStringByTheNumOfTheCharacter(String str){
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();//NullPointerException: "null" String ile "length()" kullanildiginda alinir
            i = Integer.valueOf(str);//NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda
            sonuc = i / length;//ArithmeticException: Bolen sayi sifir oldugunda alinir
        }catch(Exception e){ //tek seferde tüm sorunlari anlar
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
}
