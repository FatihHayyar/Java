package pratikler.scholol;

import java.util.Scanner;

public class SchoollMain {
    public static void main(String[] args) {
        School students=new School();
        Scanner scan=new Scanner(System.in);
        students.setNameOfSchool("Konyaalti Lisesi");
        students.setMaxNumberOfStudent(5);
        for (int i=0;i< students.getMaxNumberOfStudent(); i++){
            System.out.println("ogrenci adini girin");
            String name=scan.next();
            System.out.println("ogrenci soyadini girin ");
            String surname=scan.next();
            System.out.println("ogrenci yasini girin");
            int age=scan.nextInt();
            if (age>15){
                System.out.println("ogrenci 15 yasindan buyuk olamaz");
                i--;
                continue;
            }
students.getStudent().add(new Student(name, surname,age));

        }

        System.out.println("List von " + students.getNameOfSchool());
        for (Student student : students.getStudent()){
            System.out.println(student.getName()+" "+student.getSurname()+" "+student.getAge());
        }
    }
}
