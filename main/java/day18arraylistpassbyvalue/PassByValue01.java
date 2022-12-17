package day18arraylistpassbyvalue;

public class PassByValue01 {
    public static void main(String[] args) {
int y=5;
        change(y);
        System.out.println(y);
        int gomlek=100;//gomlek fiyati degismez baska bir sayiya atarsak degisir

        int indgomlek=rabatt(gomlek);
        System.out.println("indirimli gomlek = " + indgomlek);

    }
        public static void change(int s){
            System.out.println(s*3);

    }
    public static int rabatt(int a){ //void yoksa return kullanilir.

        return a-10;

    }
}
