package day28abstraction;

public abstract class Animal {
    public abstract void eat();//body si olmayyan metotlar abstracttir. Kullnilmayan body yazilmaz
//bir metodu abstract yapmak icin body sil ve abstract keyword kullanilir
//abstract metotlar abstract class icinde olmalidir. access modifierden sonra abstract keywordu yazilir
  //abstract class larda hem abstract metod hemde concrete metod kullanilabilir
    //concrete metod abstract olmayan demektir
    //parent , abstract ise childlar ya abstract olmali yada parent class daki tum abstract metodlari override etmeliyiz
   //eger alt class lara birseyi zorunlu kilmak istersek abstract yapariz
    public void drink(){
        System.out.println("animal drink");
    }
    public abstract void move();
}
