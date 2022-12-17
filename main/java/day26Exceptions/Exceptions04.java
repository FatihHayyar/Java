package day26Exceptions;

public class Exceptions04 {
    public static void main(String[] args) {
int age= -25;
writeAge(25);
try {
    writeAge(age);
}catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}

    }
    public static void writeAge(int age) {
        if (age<0){
            throw new IllegalArgumentException("yas negatif olamaz");
        }
        System.out.println(age);
    }

}
