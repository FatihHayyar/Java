package day23polymorphizm;

public class Math extends Courses{
    public void practice(){
        System.out.println("Solve questions..");
    }
    public Math(){
//        super("second");
        System.out.println("constracter1");
    }
    public Math(int x){
//        this();
//ayni class in icinde diger constracteri da kullanmak icin Parantez ici digerinde bos oldugu icin bos
        System.out.println("constracter2");
    }
}
