package day18arraylistpassbyvalue;

public class Varargs01 {
    //varargs arkada array gibi calisir. array da gibi dusunup islem yapabiliriz
    //baska parametrelerle kullanirsak varargs sonda olmali
    public static void main(String[] args) {

        //iki sayinin toplamini return eden bie metod olusturun
int top=toplamaYap(5,8,7);
        System.out.println(top);
int r1=coklutopla(6,12);
        System.out.println("r1 = " + r1); 
        
    }//3 sayiyi toplayan metod
    public static int toplamaYap(int a,int b,int c){
        return (a+b+c);
    }
//istedigimiz kadar sayiyi toplayacak metot yapiniz
    public static int coklutopla(int ...a){
        int sum=0;
for (int w:a){
    sum+=w;
}
return sum;

    }

}
