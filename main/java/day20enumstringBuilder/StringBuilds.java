package day20enumstringBuilder;

public class StringBuilds {
    public static void main(String[] args) {
        /*String Builder Javada bir class dir
2. String olusturmaya yarar
3.String class inmutuabledir. ama biz bazen mutuable stringlere ihtiyac duyariz. String Builder bize
mutuable string verir.
Inmutable degismez duragan demek. mutable degisime acik
Inmutable class larda var olan deger degistirilemez. Eger degistirmek isterseniz yeni bir variable
yeni degerle olusturulur. Eski variable nin pointeri yeni variable a dondurulur. Eger bir variable i
hicbir variable gostermezse garbace collector tarafindan silinir.

Mutuable class larda varolan deger degistitilir korunmaz
immutuable yapi security icin onemli. ayni degere sahip string leri tek conteiner a koyar. ancak conteiner i
degistirince hersey degisir bu yuzden java stringlri unmutuble yapmistir. degistirmek isteyince yeni bir konteyner
yapar yolu da oraya cizer digerleri etkilenmez


*/
        String hesapsahibi="Tom Hanks";
        String hesapsahibi2="Tom Hanks";
        String hesapsahibi3="Brad Pit";
//StringBuilder nasil olusturulur
StringBuilder strb=new StringBuilder("java");
//2.yol
        StringBuilder strb2=new StringBuilder();
strb2.append("Java");//buna da bisey eklemek icin yol a)
strb2.append(" is easy");
//yol b) Yanyana yazabiliriz
        strb2.append(" learn").append(" money");
//StringBuilder larda karakter sayisi bulma
        StringBuilder yeni=new StringBuilder();
        yeni.append("katze");
        int sayi=yeni.length();
        System.out.println("sayi = " + sayi);
        //once 16 kapasite verir gecersen artttirir ve 2 katinin 2 fazlasini veriri
yeni.append("ddfdffsdfdsfdsfdsg");
int capa=yeni.capacity();
        System.out.println("capa = " + capa);
//istenilen index deki karakteri istedigimiz karaktere cevirir
        yeni.setCharAt(0,'m');
        System.out.println("yeni = " + yeni);
//silmek icin ilk index dahil icincisi degildir
        yeni.delete(5,22);
        System.out.println(yeni);
        yeni.deleteCharAt(5);//sadece 1 taneyi silmek icin
        StringBuilder ters=yeni.reverse(); //ters cevirir
        System.out.println("ters = " + ters);

        String yrnist= yeni.toString();//String yapar
StringBuilder byeni=new StringBuilder(yrnist);//tekrar geri dondurduk

        byeni.insert(2,"miyav");//araya bisey koymak icin 2. karakterden sonra
        System.out.println(byeni);

        byeni.insert(2,"havhav",3,6);//2 den sonra yazdigim yainin icinden sectim
        System.out.println("byeni = " + byeni);

        int sonuc=byeni.compareTo(yeni); //karsilastirir tamamiyla ayni ise 0 veriri
        System.out.println("sonuc = " + sonuc);// alfabetik olarak ilk harfleri karsilastirir
        System.out.println(yeni);

        StringBuilder sb = new StringBuilder();
        sb.append("elma");
            System.out.println(sb.capacity());
    }
}
