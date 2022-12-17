package day24StaticEncapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student std1=new Student();
        System.out.println(std1.getStudentId());
std1.setStudentId("BC34343");
        System.out.println(std1.getStudentId());
    }
}
