package shopping;

import java.util.HashMap;
import java.util.Scanner;

public class Methots {
    private Scanner scan=new Scanner(System.in);
    private HashMap<String,String> customerLogin=new HashMap<>();
    public void entryMenu(){
        System.out.println("Welcome to DEV 5 Shopping Center!\n\n" +
                "Customer Login:1\t\tNew Customer:2");
        int option=scan.nextInt();
        switch (option) {
            case 1: customerLogin(); break;
            case 2: newCustomer(); break;
            default:
                System.out.println("Invalid option..");
                entryMenu();
        }
    }
    private void newCustomer() {
        System.out.println("Welcome to new Customer Page");

        customerLogin.put(enterEmail(),enterPassword());
        System.out.println("Successful Registration.\nYou can log in from customer login ");

        entryMenu();
            }
    private String enterEmail() {

        System.out.println("Enter your e mail address");
        String eMailAddress=scan.next();
        boolean check = eMailAddress.contains("@");
        boolean check3 = eMailAddress.contains(".");
        boolean check4 = eMailAddress.startsWith("@");
        if (check && check3 &&!check4){

        }else {System.out.println("Invalid e Mail Address");
        enterEmail();}

        return eMailAddress;

    }

    private String enterPassword() {
        System.out.println("Enter your password" +
                " (the password must have at least 6 characters, at least one minor letter,\n" +
                " at least one large letter, and at least one number)");
        String password = scan.next();
        boolean first=password.length() > 5;
        boolean second=password.replaceAll("[^a-z]","").length() > 0;
        boolean third=password.replaceAll("[^A-Z]","").length() > 0;
        boolean fourth=password.replaceAll("[^0-9]","").length() > 0;
        if (third&&first&&second&&fourth){
        }else {
            System.out.println("Invalid password");
            enterPassword();
        }
        return password;

    }
    private void customerLogin() {
        System.out.println("Enter your E mail Address   to Main menu : Q");
        String email =scan.next();
        if (customerLogin.containsKey(email)) {
            System.out.println("Enter your Password");
            String  password =scan.next();
            if (password.equals(customerLogin.get(email))) {
                System.out.println("Successful... Have a nice Shopping");
            }else {
                System.out.println("Falsh password!");
                System.out.println(customerLogin.get(email));
                customerLogin();
            }
        }else if (email.equalsIgnoreCase("q")){
            entryMenu();}
        else {
            System.out.println("invalid email ");
            customerLogin();
        }
    }
}
