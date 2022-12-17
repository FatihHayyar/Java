package day28abstraction;
/*
   Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in birden fazla "parent" i oldu,
   bu ise Java'da mumkun degildir. Cunku Java "multiple Inheritance" i desteklemez.

   "multiple inheritance" class'larda mumkun degildir fakat Java "interface" isimli yeni bir yapi olusturdu
    bu yapida "multiple inheritance" a musaade etti.

*/
public class Civic implements Engine,Ac,Hood {
    @Override
    public void eco() {
        System.out.println("user eco engine");
    }

    @Override
    public void gas() {
        System.out.println("uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("uses tsi");
    } //bir classi interface in child i yapmak icin implements kullanilir

    @Override
    public void digital() {
        System.out.println("uses digital");
    }

    @Override
    public void climate() {
        System.out.println("uses climate");
    }

    @Override
    public void steel() {
        System.out.println("uses steel");
    }
}
