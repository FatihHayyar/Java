package baska;

public class EntryDisplay {
    public static void main(String[] args) {
        UserCheck kontrol=new UserCheck();
        kontrol.getIdpswrd().put(12345678,1876);
        kontrol.getIdpswrd().put(22222222,1234);
        kontrol.getIdpswrd().put(98765432,1453);
        kontrol.getIdpswrd().put(55554444,2020);

        kontrol.getIdmoney().put(12345678, 120.0);
        kontrol.getIdmoney().put(22222222,3000.0);
        kontrol.getIdmoney().put(98765432,7000.0);
        kontrol.getIdmoney().put(55554444,50.0);

    kontrol.checkPassword();
    kontrol.menu();


}

    }




