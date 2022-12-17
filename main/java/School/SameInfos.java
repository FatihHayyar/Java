package School;

public class SameInfos {
    private  String name;
    private  String surname;
    private String status;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SameInfos(String name, String surname, String status) {
        this.name = name;
        this.surname = surname;
        this.status = status;
    }

    @Override
    public String toString() {
        return "SameInfos{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public SameInfos() {
    }
}
