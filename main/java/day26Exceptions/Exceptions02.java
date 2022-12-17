package day26Exceptions;

public class Exceptions02 {
    public static void main(String[] args) {
String str="Fadime";
char a=getCharFromString(str,4);
        System.out.println(a);
char b=getCharFromString(str,6);
        System.out.println(b);
    }
    public static char getCharFromString(String str,int i){
char c=' ';
try{
    c=str.charAt(i);
}catch (StringIndexOutOfBoundsException e){
    System.out.println(e.getMessage());
    e.printStackTrace();
}


        return c;
    }
}
