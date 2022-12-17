package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account {
    Scanner scan=new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    boolean flag = true;
    Map<Integer,Integer> data = new HashMap<Integer,Integer>();

    public  void  login(){
        System.out.println("Welcome to my ATM");

data.put(12345,1234); data.put(23456,2345); data.put(34567,3456); data.put(45678,4567);
            int counter=0;
            System.out.println("enter your Account number");
            setAccountNumber(scan.nextInt());
            if(data.containsKey(getAccountNumber())){
                while(counter!=3){
                System.out.println("enter your pin number");
                setPinNumber(scan.nextInt());
                if(getPinNumber()==data.get(getAccountNumber())){
                    getAccountTypes();
                    break;
                }else {
                    System.out.println("Wrong pin number");
                    counter++;
                }if(counter==3){
                        System.out.println("Your Account is blocked..");
                    }
                }

            }else {
                System.out.println("invalid Account number");
                login();
            }
    }

    public void getAccountTypes(){
        System.out.println("select an account you want to access\n1:Saving Balance\n2:Checking Balance\n3:Exit");
        int option=scan.nextInt();
        switch (option){
            case 1: savingOperations(); break;
            case 2: checkingOperations(); break;
            case 3:flag=false;
                break;
            default:
                System.out.println("please, select an valid accout");
                getAccountTypes();
        }
    }

public void checkingOperations(){
    do {
        System.out.println("Select Options\n1:Wiew the Balance\n2:Withdraw\n3:Deposit\n4:Exit");
        int option=scan.nextInt();
        switch (option){
            case 1:
                System.out.println("Your Balance is " + moneyFormat.format(getCheckingBalance()));
                break;
                case 2:
                    getCheckingWithdraw();
                    break;
            case 3:
                getCheckingDeposit();
                break;
                case 4:
                    flag=false;
                    break;
            default:
                System.out.println("please, select a valid option");

        }

    }while (flag);
    getAccountTypes();
}
    public void savingOperations(){
        do {
            System.out.println("Select Options\n1:Wiew the Balance\n2:Withdraw\n3:Deposit\n4:Exit");
            int option=scan.nextInt();
            switch (option){
                case 1:
                    displayCurrentBalance(getSavingBalance());
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    System.out.println("please, select a valid option");

            }

        }while (flag);
        getAccountTypes();
    }
}
