package day27CompileTimeExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    public static void main(String[] args) throws IOException {
        //bir text file da texti okuyan kodu yazin
writeText();
readTheText();
    }
    public static void writeText() throws IOException {

        FileInputStream yazi= new FileInputStream("src\\main\\java\\day27CompileTimeExceptions\\file01.txt");
   //burdaki hata java ya dosya olmazsa yada adres yanlissa diye exception attirdi
        //metot isminden sonra throws FileNotFoundException yazdik ve cozduk

        int k=0;
   while ((k=yazi.read())!=-1){
       //read metodu hata verdi, cunku biz javaya dosyadaki karakterleri oku dedik. Java okumasi
       //gereken karakterler bilmedigi karakterler ise sorun cikarir. biz metot isminden sonra
       // throws IOException yazarak cozduk.
       //throws IOException FileNotFoundException nin parenti oldugu icin sadece IOException yeterli oldu
       //IOException input output exception demek cok genel 911 gibi
       //bunlar check exceptionlardir compiletime exceptionlar
       //compiletime exceptionlari halletmeden kod yazmaya devam edilmez

       System.out.print((char)k);
   }
    }
    public static void readTheText(){
        try {
            FileInputStream txt= new FileInputStream("src\\main\\java\\day27CompileTimeExceptions\\file01.txt");
            int k=0;
            while ((k=txt.read())!=-1){
                System.out.print((char)k);

            }
        } catch (FileNotFoundException e) {
            System.out.println("ya dosya yok ya yol yanlis");
        } catch (IOException e) {
            System.out.println("okunamayan bir karakter var");
        }
    }
}
