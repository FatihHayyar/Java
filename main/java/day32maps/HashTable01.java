package day32maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
    HashTable bir map tir
    HashTable entrysetlere herhangi bir siralamaya tabi tutmaz
    HashTable HashMap den daha yavastir. cunku HashTable lar Thread safe ve sencronized dir Hashmap  la 1,farki


     */
    public static void main(String[] args) {

        Hashtable<String,Integer> populatiion = new Hashtable<>();
populatiion.put("Germany", 83000000);
populatiion.put("Turkey", 85000000);
populatiion.put("USA", 383000000);
//HashTable larda key ve value null olamaz yaparsaniz nullpointer exception atar HashMap la 2. farki

Hashtable<String,Student> myStudents=new Hashtable<>();
myStudents.put("Math",new Student("Tom Hanks","gggg",45,true));
        System.out.println(myStudents);
        System.out.println(myStudents.get("Math").name);

    }
}
