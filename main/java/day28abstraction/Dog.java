package day28abstraction;

public class Dog extends Mammal{
    @Override
    public void eat() {
        System.out.println("dogs eat");
    }

    @Override
    public void move() {
        System.out.println("dogs move");
    }
}
