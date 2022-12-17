package pratikler;

public class Ondalikhesap {
    public static void main(String[] args) {
        double a=365.712;
        String b=String.valueOf(a);
        System.out.println("b = " + b);
String c="";
for (int i=b.length()-1; i>-1; i--){
    char d=b.charAt(i);
    if(d=='.'){
        break;
    }c="*"+d+c;



}
        System.out.println( c);



    }
}
