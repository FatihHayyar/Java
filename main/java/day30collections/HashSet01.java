package day30collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
//Hash bir tekniktir,birbirine benzemeyen kod üretmeyi sağlar. bo kodlar datayi unique yapar
//Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)
//hashsetler elemanlarin sirasiyla ugrasmaz,bu yuzden hizli calisir
        //Hasset ler index kullanmazlar. siralama rastgele cunku

        HashSet<String> emails=new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);
        emails.add("Mango");// ayni elemani eklemek istedigimizde hata vermedi ama 2, kez yazmaz da aynisinin ustune yazar
        System.out.println(emails);
        emails.add(null);
        System.out.println(emails);
    }
}
