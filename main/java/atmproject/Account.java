package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int accountNumber;
    private int pinNumber;
    private Double checkingBalance=0.0;
    private Double savingBalance=0.0;
    Scanner scan = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public Double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(Double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public Double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(Double savingBalance) {
        this.savingBalance = savingBalance;
    }
private double calculateCheckingBalanceAfterWitdraw(double amount) {
    checkingBalance-=amount;
    return checkingBalance;
}
private double calculateCheckingBalanceAfterDepozito(double amount){
        checkingBalance+=amount;
        return checkingBalance;
}
    private double calculateSavingBalanceAfterWitdraw(double amount) {
        savingBalance-=amount;
        return savingBalance;
    }
    private double calculateSavingBalanceAfterDepozito(double amount){
        savingBalance+=amount;
        return savingBalance;
    }
    public void getCheckingWithdraw(){
        displayCurrentBalance(checkingBalance);
        System.out.println("How much money do you want to take");
        double getAmount=scan.nextDouble();
        if(getAmount<=0){
            System.out.println("zero and negatif numbers are invalid");
            getCheckingWithdraw(); //recursive message
        }else if (getAmount>checkingBalance){
            System.out.println("you cannot take more than " + checkingBalance);

        }else {
            calculateCheckingBalanceAfterWitdraw(getAmount);
            displayCurrentBalance(checkingBalance);
        }
    }
    public void getCheckingDeposit() {
        displayCurrentBalance(checkingBalance);
        System.out.println("How much money do you want to deposit");
        double depositAmount=scan.nextDouble();
        if(depositAmount<=0){
            System.out.println("zero and negatif numbers are invalid");
            getCheckingDeposit(); //recursive message
        }else {
            calculateCheckingBalanceAfterDepozito(depositAmount);
            System.out.println();
            displayCurrentBalance(checkingBalance);
        }
    }
    public void getSavingWithdraw(){
        displayCurrentBalance(savingBalance);
        System.out.println("How much money do you want to take");
        double getAmount=scan.nextDouble();
        if(getAmount<=0){
            System.out.println("zero and negatif numbers are invalid");
            getSavingWithdraw(); //recursive message
        }else if (getAmount>savingBalance){
            System.out.println("you cannot take more than " + savingBalance);

        }else {
            calculateSavingBalanceAfterWitdraw(getAmount);
            System.out.println();
            displayCurrentBalance(savingBalance);
        }
    }
    public void getSavingDeposit() {
        displayCurrentBalance(savingBalance);
        System.out.println("How much money do you want to deposit");
        double depositAmount=scan.nextDouble();
        if(depositAmount<=0){
            System.out.println("zero and negatif numbers are invalid");
            getSavingDeposit(); //recursive message
        }else {
            calculateSavingBalanceAfterDepozito(depositAmount);
            displayCurrentBalance(savingBalance);
        }
    }


    public void displayCurrentBalance(double balance){
        System.out.println("Your Balance is " + moneyFormat.format(balance));
    }

}
