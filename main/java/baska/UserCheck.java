package baska;

import java.util.HashMap;
import java.util.Scanner;

public class UserCheck {
    private HashMap<Integer, Integer> idpswrd = new HashMap<>();
    private HashMap<Integer, Double> idmoney = new HashMap<>();

    public HashMap<Integer, Integer> getIdpswrd() {
        return idpswrd;
    }

    public void setIdpswrd(HashMap<Integer, Integer> idpswrd) {
        this.idpswrd = idpswrd;
    }

    public HashMap<Integer, Double> getIdmoney() {
        return idmoney;
    }

    public void setIdmoney(HashMap<Integer, Double> idmoney) {
        this.idmoney = idmoney;
    }
    Scanner scan = new Scanner(System.in);
    int id=0;
    public void checkPassword() {

        while (true) {
            System.out.println("Enter your customer id: ");
            id = scan.nextInt();
            System.out.println("Enter your password: ");
            int password = scan.nextInt();
            boolean a = false;

            if (!idpswrd.containsKey(id)) {
                System.out.println("id yanlis... Lutfen gecerli bir id girin");
                a = false;
            } else {
                for (Integer w : idpswrd.keySet()) {
                    if (w == id && idpswrd.get(id) == (password)) {
                        System.out.println("giris basarili");
                        a = true;
                        break;
                    } else
                        a = false;
                }
                if (a == false) {
                    System.out.println("parola yanlis.. Lutfen parolanizi dogru girin");

                }else break;
            }


        }
    }
    public void menu(){
        System.out.println("Hosgeldiniz");
        while (true) {
            System.out.println("Hangi islemi yapmak istiyorsunuz?" +
                    "Para Cekme:1 Para Yatirma:2 Bakiyeyi gor:3 Cikis:4");
            String islem = scan.next();

            if (islem.equals("1")) {
                paracek();

            } else if (islem.equals("2")) {
                parayatir();
            } else if (islem.equals("3")) {
                System.out.println("bakiyeniz= " + idmoney.get(id));

            } else if (islem.equals("4")) {
                System.out.println("Gule gule...");
                break;
            }else System.out.println("Gecerli bir islem secin");
        }
    }
    public void paracek(){
        System.out.println("kac para cekmek istiyorsunuz?");
        double cekpara=scan.nextDouble();
        if(cekpara>idmoney.get(id)){
            System.out.println("o kadar paraniz yok bakiyeden fazla para cekemezsiniz");
        }else {
          double a=idmoney.get(id)-cekpara;
            idmoney.put(id,a);
            System.out.println("kalan bakiye= "+idmoney.get(id));
    }
    }
    public void parayatir(){
        System.out.println("kac para yatirmak istiyorsunuz?");
        double parayatir=scan.nextDouble();

            double a=idmoney.get(id)+parayatir;
            idmoney.put(id,a);
            System.out.println("kalan bakiye= "+idmoney.get(id));
    }
}