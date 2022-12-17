package day28abstraction;

public class Accort implements Engine,Ac,Hood{
    @Override
    public void eco() {
        System.out.println("uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("uses tsi");
    }

    @Override
    public void digital() {
        System.out.println("uses digital");
    }

    @Override
    public void climate() {
        System.out.println("uses climate");
    }

    @Override
    public void steel() {
        System.out.println("uses steel");
    }
}
