package day21accesmodifierinheritence;

public class StudentRunner {//icinde main metot olan class lara genelde runner denir
    public static void main(String[] args) {
Student std=new Student();
String a=std.adress; //Heryerden ulasirim
String b=std.mail; //Ayni package de oldugumdan ulastim.baska package den cocugu yaparsak kullanabiliriz
String c=std.studentname; //Ayni package de oldugumdan ulastim. baska package den kullanilamazlar
//privqte e sadece kendi class indan ulasabilirim
//Class lar icin public ve default kullanilabilir. Diger ikisi kullanilamaz


    }



}
