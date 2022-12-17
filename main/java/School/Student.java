package School;

public class Student extends SameInfos {
    private String classes;
    private Integer nummer;

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Integer getNummer() {
        return nummer;
    }

    public void setNummer(Integer nummer) {
        this.nummer = nummer;
    }

    public Student(String name, String surname, String status, String classes, Integer nummer) {
        super(name, surname, status);
        this.classes = classes;
        this.nummer = nummer;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "classes='" + classes + '\'' +
                ", nummer=" + nummer +
                '}';
    }
}
