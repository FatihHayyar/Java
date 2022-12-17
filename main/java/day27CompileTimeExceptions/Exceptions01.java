package day27CompileTimeExceptions;

public class Exceptions01 {
    public static void main(String[] args) {
String name="Java";
String nm="ab";
double sonuc=compare(name, nm);
        System.out.println(sonuc);


    }
    //verilen iki stringden birinin karakter sayisinin digerinin kac kati oldugunu veren metot olustuun
    public static double compare(String a,String b){
        double result=0;
        try {
           result=a.length()/b.length();
        }catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }finally {
            System.out.println("islem bitti");
        }

        return  result;
    }
}
/* final, finally, finalize aciklayin
final bir keyyworddur. variable ,class ve metotlarda kullaniriz
finally bir kod bloktur. try catch veya sadece try ile kullanilir. finaly kod blok icine yazilan kodlar
her halukarda calistirilir. mesela database ile baglantiyi kesmek her halukarda gerekldir o yuzden gereklidir
finalize bir metotdur. java tarafindan datalar imha emha edilmeden once cagrilir bu metot datalari
imha edilecek hale getiri. garbace collector de bu datalari imha eder
finalize metodunu java developerlarda cagirabilir ama java kendi bildigini yapar
Interview sorusu : "final", "finally", "finalize" nedir?
final(keyword): ==> final method override edilemez.
              final variable degeri degistirilemez.
              final class child class sahibi olamaz.
finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.

finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir

  1)"final" bir keyword'dur. Variable, Class, ve Method'lar icin kullanilir.
              "final" keyword i)Variable'larda kullanilabilir.
                        public final int age = 12;
                        a)Atanan deger degistirilemez.
                        b)Deger atamasi yapilmak zorundadir.

                    ii)Method'larda kullanilabilir.
                       public final int add(){
                       return a+b;
                   }
                        a)Bir method olusturulurken "final" olarak olusturulmus ise
                          o methodun body'si asla degistirilemez. Dolayisiyla o method override edilemez.

                   iii)Class'larda kullanilabilir.
                       Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz
                       Bir Class "final" ise o Class'a extend edilemez.
                       "final" Class Child olabilir.
 */