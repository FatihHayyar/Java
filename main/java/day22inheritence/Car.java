package day22inheritence;

public class Car extends Vehicle{
    public String color;
    public int km;
    public Car(){

    }
    public Car(String color,int km){
        super("car");
this.color = color;
this.km = km;
        System.out.println("Car Constracter");
    }



}
