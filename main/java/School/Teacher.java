package School;

public class Teacher extends SameInfos{
    private  String department;
    private  Integer idno;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getIdno() {
        return idno;
    }

    public void setIdno(Integer idno) {
        this.idno = idno;
    }

    public Teacher(String name, String surname, String status, String department, Integer idno) {
        super(name, surname, status);
        this.department = department;
        this.idno = idno;
    }

    public Teacher() {

    }

    @Override
    public String toString() {
        return "Students{" +
                "department='" + department + '\'' +
                ", idno=" + idno +
                '}';
    }
}
