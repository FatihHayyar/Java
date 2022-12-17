package day26Exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
int a=convertStringToInteger("123");
        System.out.println(a+5);
int b=convertStringToInteger("1a2b");
        System.out.println(b*5);
    }
    public static int convertStringToInteger(String str) {
        int i=0;
        try {
          i= Integer.valueOf(str);
        }catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
return i;
    }

}
