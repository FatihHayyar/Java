package day23polymorphizm;

public class Cat extends Mammals{
    public void miaw(){
        System.out.println("Cat miaw");
    }

    @Override //istedigimiz gibi edit ettik olan metodu edit edip kullandik. @override annotationu ile java otomatik kontrol eder
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public int topla(int a, int b) {
        return (a+b+1);
    }
}
/* overriding yaparken metodun boddy si degistirilir
metot signature degistirilmez (isim ve parametre)
inheritance olmak zorundadir
Access modofiarla belli kurallara gore farklilastirilabilir
Private metotlar override edilemezler
Child class daki override edilen metodun acces modofier i parent classdaki metodun accesmodifier
ile ayni veya genis olmalidir.
default metotlar farkli packace de is gorunmeyecginden override edilemezler
parent classdaki metodun return typi void ise return typ degistirilemez
Return type primitive ise yine degistirilemez
Return type wrapper ise yine degistirilemez
Return type Parent class ise return typ child lardan biri olabilir
child classdaki return typ parent classdakinden genis olamaz
aralarinda parent-child iliskisi olmayan class lar overridingde kullanilamaz
IS A child dan parent a inheritance
HAS A parent tan  childa inheritance
aralarinda IS-A ve HAS-A relationship olan data typ lara covaryant denir
Final metotlar override edilemezler
Polimorfizm overriding ve overloading demektir
Overloading ve Overriding Farklari
1. overloading icin inheritance gerekmez -overriding de gerekir
2.Private metotlar overload edilebilir. ama override edilemez
3.Final metotlar overload edilebilir. ama override edilemez
4.overloading statik Polimorfizm, Overriding dinamik Polimorfizm olarak adlandirilir.
cunku statik metotlar overload edilebilir. ama override edilemez
5. Overloading de metot signature degisir override degismez


 */