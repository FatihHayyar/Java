package day30collections;

import java.util.PriorityQueue;

public class PriorityQueue01 {
    public static void main(String[] args) {

        PriorityQueue<String> myQueue=new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("G");
        myQueue.add("B");
        myQueue.add("E");
        myQueue.add("C");
        System.out.println(myQueue);
        //Java kendi onceligine gore siraladi. Kendimizde bir siralama onceligi yapabiliriz
    }
}
