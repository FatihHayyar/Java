package smallStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> listeye = new ArrayList<>(Arrays.asList(6,7,25,4,8,1));
        List<Integer> liste = new ArrayList<>();
        int a=listeye.size();
        int lst[][]={{1},{3},{2}};
        Collections.sort(listeye);
        Collections.reverse(listeye);

        System.out.println(listeye);

        for (int i=0;i<listeye.size();i++) {
            int min=1000;
        for(int j=0;j<listeye.size();j++) {
           if (liste.contains(listeye.get(j))){
               continue;

           }else if (min>listeye.get(j)){
               min=listeye.get(j);
           }
        }
        liste.add(min);

        }
        System.out.println(liste);

    }

}