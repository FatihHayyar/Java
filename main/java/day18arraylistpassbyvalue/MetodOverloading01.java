package day18arraylistpassbyvalue;

public class MetodOverloading01 {
public static void main(String[] args) {

add(3,5);

//MetodOverloading ile ayni metot ismi olursa icerde hangi class en uygunsa onu secer. esit uzaklikta ise
    //hata veriri
    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void add(int a,double b){
        System.out.println(a+b);
    }
    public static void add(double a,int b,int c){
        System.out.println(a+b+c);
    }



}
