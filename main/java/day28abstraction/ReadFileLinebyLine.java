package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLinebyLine {
    public static void main(String[] args) {
        readFileLinebyLine();

    }
    public static void readFileLinebyLine() {
        String line = "";
        try {
            BufferedReader str = new BufferedReader(new FileReader("src/main/java/day27CompileTimeExceptions/file01.txt"));
            line = str.readLine();
            while (line != null){
                System.out.println(line);
                line=str.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("path false or file not found");
        } catch (IOException e) {
            System.out.println("there is a problem reading");
        }
/* Throw ile throws arasindaki farklar
1. throw metodun body si icinde kullanilir. throws ise metodun isminden sonra kullanilir
2.throw dan sonra object olusturulur. throws dan sonra ise sadece exception classin ismi yazilir
3. throw metodun icinde istedigimiz yerde exception üretmek icin kullanilir. throws ise var olan check
exception i atmak icin kullanilir.
4. throw dan sonra sadece 1 tane exception olabilir. throwsdan birden fazla exception olabilir.


 */

    }
}
