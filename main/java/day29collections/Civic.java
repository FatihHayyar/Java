package day29collections;

public class Civic implements Ac,Engine{
// abstract metotlar sadece ne yapilacagini soyler. nasil yapilacagini child belirler
    //interface ler yapilacak isler listesidir. to do list
    //eger iki netodu farkli return type ile yapacaksak metod isimleri farkli olmali

    @Override
    public void run() {
        System.out.println("civic run well");
    }


}
