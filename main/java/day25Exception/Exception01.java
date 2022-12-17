package day25Exception;

public class Exception01 {
    public static void main(String[] args) {

devide(6,2);
devide(6,0); //0 ile bolunmeme sorununu cozduk ama tavsiye edilmez. Her kurali bilemeyiz cunku
devide2(5,0);
    }
    public static void devide(int a,int b){
        if (b==0){
            System.out.println("bir sayi 0 ile bolunemez");
        }else
        System.out.println(a/b);
    }
    public static void devide2(int a,int b){
        try {                               //2.yol sorunu Handle ettik bu tavsiye edilir
            System.out.println(a/b);
        }catch (ArithmeticException e) { //matematiikle ilgili sorunlar aritmetic exception olarak verir
            System.out.println("Bolme isleminde sorun var "+e.getMessage());
            System.err.println("Bolme isleminde sorun var "); //renkli hata mesaji
        }
        System.out.println("sorun sonrasi yazdim");
    }
}
//exception la calismanin 2 yolu vardir.
//1.try catch yontemi calisma devam eder
//2.throw exception calisma durur
// e.printStackTrace(); yazar detayli teknik bilgi verir