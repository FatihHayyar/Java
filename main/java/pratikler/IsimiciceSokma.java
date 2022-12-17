package pratikler;

public class IsimiciceSokma {
    public static void main(String[] args) {


    String name="Mehmet";
    String name2="ahmet";
    int sayi=name.length();
    if (sayi%2==0) {
        System.out.println(name.substring(0,(name.length()/2))+name2+name.substring(name.length()/2));
    }else System.out.println("Name2 cannot be inserted in the name1");

}}
