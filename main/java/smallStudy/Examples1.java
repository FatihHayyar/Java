package smallStudy;

import jdk.jshell.spi.SPIResolutionException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Examples1 {
    /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */
    public static void main(String[] args) {


        System.out.println("Welcome to DEV TEAM 5 Grocery!");
        chooseCustomer();
    }
    public static void chooseCustomer() {
        Scanner scan = new Scanner(System.in);
        String fruits1="";
        List<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("watermelon");
        fruits.add("banana");
        fruits.add("kiwi");
        List<Double> preises = new ArrayList<Double>();
        preises.add(2.3);
        preises.add(1.8);
        preises.add(1.5);
        preises.add(3.0);
        preises.add(2.5);

while (true){
            System.out.println("Choose a fruit, please\nApple-Orange-Watermelon-Banana-Kiwi");
            String chooseCustomer = scan.next().trim().toLowerCase();
            if (chooseCustomer.equals("apple") || chooseCustomer.equals("orange")
            || chooseCustomer.equals("watermelon") || chooseCustomer.equals("banana")
            || chooseCustomer.equals("kiwi")) {
                fruits1=chooseCustomer;
            System.out.println("How money kg?");
            double weight = scan.nextDouble();
            totalprice=totalprice+weight*preises.get(fruits.indexOf(fruits1));
                System.out.println("Total price: " + totalprice);
            }else System.out.println("write a valid fruit !!!");
    System.out.println("do you want to buy other fruit? y/n");
    char cnt = scan.next().trim().charAt(0);
    if (cnt=='n'){
        System.out.println("Total price: " +totalprice+ " Good Bye!");
        break;
    }

    }}



public static double totalprice;


}
