package School;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methots {
public static String user;
static Scanner scan=new Scanner(System.in);
static Student student=new Student();
static ArrayList studentnote =new ArrayList();
    public static void mainScreen(){

        System.out.println("Welcome to Our Schools\n Please choose your Gruppe\n\n" +
                "================================================\n" +
                "Students and Teachers Controls Page\n" +
                "================================================\n" +
                "1: Students Page\n2: Teachers\n3: Exit");
        String chose=scan.next();

        switch (chose){
            case "1":
                user="Students";
                optionsst();
                break;
                case "2":
                user="Teacher";
//                optionstch();
                break;
                case "3":
                System.out.println("Good Bye...");
                break;
            default:
                System.out.println("Invalid option");
                mainScreen();
        }

    }

    private static void optionsst() {
        System.out.println("Welcome "+ user+"s Page");
        System.out.println("==========Options=========\n" +
                "1:Look your Profile\n2:Enter your Notes\n3:Main Menu\n4:Exit");
        String chsop=scan.next();
        switch (chsop){
            case "1":
                System.out.println(student.toString());
                break;
                case "2":
                    System.out.println("Enter your Notes");
                    String newnotes=scan.nextLine();
                    studentnote.add(newnotes);
                    break;
                    case "3":
                        mainScreen();
                        case "4":

        }
    }
}
