package day22inheritence;

public class HondaAccort extends Honda{
    /*Class olusturdugumuzda java bize otomatik gorunmez bir constracter verir. Cunku jaava clasin
    bir kalip oldugunu ve object olusturmak icin yapildigini bunun icin de constracterin sart
    oldugunu bilir.
    2. Java nin otomatik olarak olusturdugu bu gorunmez constracter a default constracter denir
    3, biz kendimiz bir constracter olusturursak java default olani siler
    4. bir class da birden fazla constracter olabilir. fakat parametreleri farkli olmalidir
5.this keyword bu class demektir. saddce constracter icinde kullanilir
6. constracter kullanarak yapilan degisiklikler sadece objedeki degerleri degistiri. Class daki degismez
     */

    public int price;
    public int year;
    public String make;
    public String model;
public HondaAccort() {//parametreleri oynayarak farkli constracter lar yaptik
}
public HondaAccort(int price) {
    this.price = price;
}
public HondaAccort(int price, int year) {
    this.price = price;
    this.year = year;
    System.out.println("Honda Accort Constracter");
}public HondaAccort(int price, int year,String model,String make) {
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;
    }

}
