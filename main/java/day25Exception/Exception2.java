package day25Exception;

public class Exception2 {
    public static void main(String[] args) {
        //bir string array dan index girerek eleman elde edbilmek icin bir metod olusturn
String arr[]={"ali", "veli", "can", "Han"};
getElementFromArray(arr,2);
getElementFromArray(arr,4);

    }
    public  static  void getElementFromArray(String arr[],int i){
        try {
            System.out.println(arr[i]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
            e.printStackTrace();//teknik hata raaporu
        }

    }
}
