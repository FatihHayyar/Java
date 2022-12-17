package smallStudy;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Arrays;
import java.util.Scanner;

public class Examples {

    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *           ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *           ortalama kazançtan aşağıysa o günleri return yap.
     * */
   public static double average = 0;
 public static  String days[]={ "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    public static void getAverageEarnings(double...a){
        double sum = 0;

        for (double i:a){
            sum+=i;
        }
        average=sum/a.length;
        Format nn=new DecimalFormat(".##");
        System.out.println("Average Earnings: " + nn.format(average));
    }
    public static void overAverage(double average,double...a){
        System.out.println("OverAverage earningsdays= ");
        for (int i=0;i<a.length;i++){
            if (a[i]>average){
                System.out.println(days[ i]+" ");
            }
        }
    }
    public static void belowAverage(double average,double...a){
        System.out.println("BelowAverage earningsdays= ");
        for (int i=0;i<a.length;i++){
            if (a[i]<average){
                System.out.println(days[i]);
            }
        }
    }
    public static void main(String[] args) {


    double earnings[]=new double[7];
    Scanner scan=new Scanner(System.in);
    int number=0;
    while(number<7){
        System.out.println(days[number]+" kazancini girin");
        earnings[number] = scan.nextInt();
        number++;
    }
        getAverageEarnings(earnings);
    double k=3;
overAverage(average,earnings);
belowAverage(average,earnings);
}}
