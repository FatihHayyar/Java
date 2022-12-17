package day32maps;

public class StaticBlocks01 {
    //Statik block lar tum metot ve main metotdan once calistirilir.
    //Statik block icinde sadece static variable lara deger atanabilir
    //birden fazla static block koyulabilir

    public static Double pi;
static {
    pi=3.14;
}
    public static void main(String[] args) {

    }
}
