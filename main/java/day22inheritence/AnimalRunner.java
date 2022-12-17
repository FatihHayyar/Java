package day22inheritence;

public class AnimalRunner {
    public static void main(String[] args) {
Cat cat1=new Cat();
        System.out.println(cat1.a);//Hangi class dan object yaparsak ordaki degeri verir(variable cagirirken)
        Mammel cat2=new Cat();
        System.out.println(cat2.a);
 Animal cat3=new Cat();
        System.out.println(cat3.a);
        //Eger kendisinde yoksa parent takini alir
        System.out.println(cat1.c);
        //Java ayni metot varsa once kendininkini secer(Metot cagirirken)
Cat cat4=new Cat();
cat4.eat();
Mammel cat5=new Mammel();
cat5.eat();
Animal cat6=new Animal();
cat6.eat();






    }
}
