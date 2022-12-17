package day22inheritence;

public class Honda extends Car{
    public String color;

    public Honda(){
super("Blue",54000);
        System.out.println("Honda Constracter");
    }
    public Honda(String color){
this.color = color;
    }
}
