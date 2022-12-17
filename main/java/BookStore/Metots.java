package BookStore;

import java.util.Map;
import java.util.Scanner;

public class Metots extends Infos{
    private Scanner scan=new Scanner(System.in);
    public void menuGoster() {
        System.out.println("Welcome to BookStore\nSelect a Option\n1 :Add a Book\n2 :Show a Book with Number\n" +
                "3 :Show a Book with Bookname\n4 :Delete a Book with Number\n5 :Show all Book\n6 :Exit");
        int option =scan.nextInt();
        switch (option) {
            case 1:
                addBook();
                menuGoster();

                break;
            case 2:
                showBookWithNumber();
                    menuGoster();
                break;
            case 3:
                showBookWithInfo();
                break;
            case 4:
                deleteBook();
                    menuGoster();
                break;
                case 5: showAllBooks();
                menuGoster();
            default:
                System.out.println("invalid option");
        }
    }

    private void showAllBooks() {
        System.out.println(getMylist().keySet());
    }

    private void deleteBook() {
        System.out.println("Enter Book s Number");
        int checkno= scan.nextInt();
        if (getMylist().containsKey(checkno)){
getMylist().remove(checkno);
        }else System.out.println("we have not this book");
    }

    private void showBookWithInfo() {
        System.out.println("Write Book s Name");
        String newBookname= scan.next();

        for (Map.Entry<Integer, Infos> w:getMylist().entrySet()){
           if(getMylist().get(w).getBookName().equals(newBookname)){
               System.out.println(getMylist().get(w).getBookNo()+" "
               +getMylist().get(w).getBookName()+" "+getMylist().get(w).getAuthorName());
               break;
           }

           }




    }

    private void showBookWithNumber() {
        System.out.println("Enter Book s Number");
        int checkno= scan.nextInt();
        if (getMylist().containsKey(checkno)){
            System.out.println(getMylist().get(checkno).getBookName()+" "+getMylist().get(checkno).getAuthorName()
            +" "+getMylist().get(checkno).getPrice());
        }else System.out.println("we have not this book");

    }

    private void addBook() {
        System.out.println("Write book name");
        String bookName =scan.next();
        System.out.println("Write Author name");
        String authorName =scan.next();
        System.out.println("Write Book Price");
        double price =scan.nextDouble();
        getMylist().put(getBookNo(),new Infos(bookName,authorName,price));
        setBookNo(getBookNo()+1);
    }
    private boolean docontinue(){
        System.out.println("Do wou want to continue? Y/N");
        String answer =scan.next();
        boolean asn = false;
        if(answer.equalsIgnoreCase("y")){
            asn = true;
        }else if(answer.equalsIgnoreCase("n")){
            asn = false;
        }else {
            System.out.println("invalid answer");
            docontinue();
        }return asn;
    }
}
