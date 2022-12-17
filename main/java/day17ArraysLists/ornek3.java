package day17ArraysLists;

import java.util.ArrayList;
import java.util.List;

public class ornek3 {
    public static void main(String[] args) {
        //bir salary list yapin binden az ise 30, binden yuzde 10 zam yapin

        List<Double> budget= new ArrayList<>();
        budget.add(1200.50);
        budget.add(850.75);
        budget.add(1000.00);
        budget.add(1275.60);
        budget.add(1200.50);
        for(double x : budget) {
            if(x < 1000){
                budget.set(budget.indexOf(x),x*1.3 );
            }else {
                budget.set(budget.indexOf(x),x*1.1 );
            }
        }
        System.out.println(budget);
    }
}
