package BookStore;


import java.util.HashMap;


public class Infos {
    private String bookName;
    private int bookNo=1000;
    private String authorName;
    private double price;
   private HashMap<Integer,Infos> mylist = new HashMap<Integer,Infos>();

    public HashMap<Integer, Infos> getMylist() {
        return mylist;
    }

    public void setMylist(HashMap<Integer, Infos> mylist) {
        this.mylist = mylist;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        price = price;
    }

    public Infos(String bookName, String authorName, double price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    public Infos() {
    }
}
