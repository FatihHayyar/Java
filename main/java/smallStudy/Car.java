package smallStudy;



public class Car {
    public static void main(String[] args) {
        int top=0;
      for (int i = 0; i <100; i++){
          if (i%3==0||i%5==0) {
              top+=i;
          }
      }
        System.out.println(top);
    }
}

