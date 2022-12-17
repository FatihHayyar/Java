package day24StaticEncapsulation;

public class CarRunner {
    public static void main(String[] args) {
Car car1=new Car();
Car car2=new Car();//Static her consracter da calisir.
Car car3=new Car();
Car car4=new Car();

        System.out.println(car1.counter);
        System.out.println(Car.counter);//static lere direkt class dan ulasmak daha dogru
        System.out.println(car1.price);
        System.out.println(car2.counter);
        System.out.println(car2.price);

    }
}
