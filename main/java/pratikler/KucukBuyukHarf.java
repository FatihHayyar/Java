package pratikler;

public class KucukBuyukHarf {
    public static void main(String[] args) {
        String isim="fatih hayyar";
        String buyukisim=isim.toUpperCase();
       String a=isim.substring(0,1).toUpperCase()+isim.substring(1);
       String b=a.substring(0,6)+a.substring(6,7).toUpperCase()+a.substring(7,12);
        System.out.println("a = " + b);


    }
}
