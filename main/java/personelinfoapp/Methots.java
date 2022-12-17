package personelinfoapp;
import java.util.HashMap;
import java.util.Scanner;

public class Methots {
    private HashMap<String, Methots> persoinfos=new HashMap<>();
    private String fullname;
    private String idno;
    private String telNo;
    private String address;
   
    boolean flag = true;
    Scanner scan=new Scanner(System.in);

    public Methots(String fullname, String telNo, String address) {
        this.fullname = fullname;
        this.telNo = telNo;
        this.address = address;
    }

    public Methots() {

    }










    public void selectOption(){
        System.out.println("Welcome to Personel Info App...");
        do{

            System.out.println("Please, select your choice...\n1:Save Info" +
                    " 2:Show Info 3:Remove Info 4:Exit");

            int option =scan.nextInt();
            switch (option) {
            case 1:
                saveInfo();
                break;
            case 2:
                showInfo();
                break;
            case 3:
                removeInfo();
                break;
            case 4:
                System.out.println("Good Bye..");
                flag=false;
                break;
            default :
                System.out.println("please, select a valid option");
            }
        }while (flag);

    }

    private void saveInfo() {

        System.out.println("you are in Save Info");

        System.out.println("Write your id Nummer");
        idno=scan.next();
        if (!persoinfos.containsKey(idno)) {

       getInfo();

        System.out.println("to continue:1 Main Menu:2 Exit:3");
        int check=scan.nextInt();
        while (flag){
        if (check==1){
            saveInfo();
            break;
        }else if(check==2) {
            selectOption();
            break;
        }else if (check==3){
            System.out.println("Good Bye..");
            flag=false;
            break;
        }else {
            System.out.println("Invalid choice");
        }
        }
        }else System.out.println("you cannot write an id number 2 times");


    }
    int counter=0;
    private void showInfo() {
        System.out.println("write id number you want to see");
        String getId=scan.next();

        if (persoinfos.containsKey(getId)){
            System.out.println("Fullname: "+persoinfos.get(getId).fullname
            +"\nAddress: "+persoinfos.get(getId).address+"\nTelefon:  "+persoinfos.get(getId).telNo);
            System.out.println("Main Menu:1 Exit:2");
            int cont=scan.nextInt();
            if (cont==1){
                selectOption();
            }else if(cont==2){
                System.out.println("Good Bye..");
                flag=false;
            }else {
                System.out.println("invalid choice");
                showInfo();
            }
        }else {
            System.out.println("invalid id number");
            counter++;
            if (counter==3){
                System.out.println("Good Bye..");
                flag=false;
            }else {
                showInfo();
            }
        }
    }
    int counter1=0;
    private void removeInfo() {
        System.out.println("write id number you want to delete");
        String remId=scan.next();
        if (persoinfos.containsKey(remId)){
            persoinfos.remove(idno);
            System.out.println("Main Menu:1 Exit:2 Continue:3");
            int cont=scan.nextInt();
            if (cont==1){
                selectOption();
            }else if(cont==2){
                System.out.println("Good Bye..");
                flag=false;
            }else  if(cont==3){
                removeInfo();
            }else {
                System.out.println("invalid choice");
               removeInfo();
            }
            }else {System.out.println("invalid id number");
            counter1++;
            if (counter1==3){
                System.out.println("Good Bye..");
                flag=false;
            }else {
                removeInfo();
            }


        }
    }
    public void getInfo(){
        System.out.println("Write your Name");
        String firstName=scan.next();
        System.out.println("Write your Surname");
        fullname=firstName+" "+scan.next();

        System.out.println("Write your Telefon Nummer");
        telNo=scan.next();

        System.out.println("Write your Address");
        address=scan.next();

        persoinfos.put(idno,new Methots(fullname,telNo,address));
    }

        }
