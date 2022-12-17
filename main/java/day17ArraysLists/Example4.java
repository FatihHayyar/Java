package day17ArraysLists;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        //iki array esit mi
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('a');
        m.add('z');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');
// 1.yol
        if (m.size() == n.size()   ) {
            for (int i=0; i<m.size();i++) {
            if (m.get(i) != n.get(i)) {
                System.out.println("listler esit degil");
                break;
            }
            if (i == m.size() - 1) {
                System.out.println("Listler esit");
            }
            } }else System.out.println("Listler esit degil");
        //2e.yolu
        boolean control=m.equals(n);
if (control) {
    System.out.println("listler esit");
        }
        else {
            System.out.println("Listler esit degil");
        }
    }
}
