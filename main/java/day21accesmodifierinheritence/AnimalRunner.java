package day21accesmodifierinheritence;

public class AnimalRunner {//inheritance yani cocugu yapma
    //cocugun class ina ekleriz babayi
    //inharitance ile kod tekrarindan kurtuluruz
    //maintenance (tamir) daha kolay olur
    //child class lar daha atomik olur.
    //child class lar parent in metod ve variable sini kullanabilir ama parentler child inkini kullanamaz
    //object class her class in parent i dir
    //privat metotlar inheritance edilemez
    //Protected lar ayni packagede inheritance edilebilir
    //Default metot ve variable lar child lar tarafindan kullanabilir ayni package de
//inherit edilebilir demek childlar tarafindan kullanilabilir demek
    //4 tip inheritance vardir
    //1.multilevel (bina gibi) 2.Hiyearchical (bir parent cok cocuk)
    // 3.Multible (java desteklemez) (bir child e coklu parent
    //4.Singel (bir childa bir parent)

    public static void main(String[] args) {
        Cat kedi=new Cat();
        kedi.miaw();
        kedi.eat();
        kedi.drink();
        System.out.println(kedi);
//Cocugu yaptigimiz icin ulastik



    }
}
