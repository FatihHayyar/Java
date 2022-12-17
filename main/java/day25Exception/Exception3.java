package day25Exception;

public class Exception3 {
    public static void main(String[] args) {
        //bir stringde bulunan karakterlerin sayisini bulmak icin bir metot yapin
String str ="Ali";
getNumsChars(str);
String s="";
getNumsChars(s);
String t=null;
getNumsChars(t);
    }
    public static void getNumsChars(String str){
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
