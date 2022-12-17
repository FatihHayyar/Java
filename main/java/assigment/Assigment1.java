package assigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assigment1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<Integer> mylist=new ArrayList<Integer>();
        boolean flag=true;
        while (flag){
        System.out.println("Which option do you want to select ?");
        System.out.println("1: Add a integer to mylist\n2: Remove a integer from mylist\n" +
                "3: Update a integer in mylist\n4: Exit");
        int option=scan.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter a number to add to mylist");
                int addNumber = scan.nextInt();
                mylist.add(addNumber);
                System.out.println(mylist);
                break;
            case 2:
                System.out.println("Enter a number to remove from mylist");
                int removeNumber = scan.nextInt();
                if (mylist.contains(removeNumber)){
                mylist.remove(mylist.indexOf(removeNumber));
                System.out.println(mylist);}
                else System.out.println("this number is not in mylist");
                break;
            case 3:
                System.out.println("what number do you want to change?");
                int updateNumber = scan.nextInt();
                if (mylist.contains(updateNumber)) {
                    System.out.println("Enter a number to update");
                    int newNumber = scan.nextInt();
                    mylist.set(mylist.indexOf(updateNumber), newNumber);
                    System.out.println(mylist);
                } else System.out.println("This number is not in mylist");
                break;
            case 4:
                System.out.println("Good Bye..");
                flag=false;
                break;
            default:
                System.out.println("Invalid option");
        }
        }
    }
}
