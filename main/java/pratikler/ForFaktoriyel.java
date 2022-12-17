package pratikler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ForFaktoriyel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String reversed = "";

String sentence2[]=sentence.split("");

    for (int i=sentence2.length-1;i>-1;i--){
        reversed=reversed+sentence2[i];
}System.out.println(reversed);

    }}
