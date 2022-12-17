package day24StaticEncapsulation;

public class Student {
    //Encapsulation kapsullemek demektir
//    Data Hiding Gizlemek demektir. Data yyi dis etkenlerden korumak icin gizleriz
    //Access modifier ini private yaparak gizlenir
    //get metotlar olusturarak gizledigimiz datalari okunur hale getiririz. Kisaca getters denir
    //set metotlar olusturarak gizledigimiz datalari degistirebiliriz kisaca setters denir
    //variable n data type ile getter in return type i aynidir
    // get metotlari isimlendirirken get + variablename koyariz. sadece boolean da is + variablename olur

    public String studentName="Tom Hanks";
    private String studentId="Tm45444444";
    private double gpa=3.8;
    private boolean retire=false;

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetire() {
        return retire;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetire(boolean retire) {
        this.retire = retire;
    }
}
