package Supermarket;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Attemps {
Scanner scan=new Scanner(System.in);
    private List<Product> products=new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void Listeleme() {
        System.out.println("Id\t\tUrun adi\tUreticisi\tMiktari\tBirimi\tRaf");
        for (int i = 0; i < 60; i++)
            System.out.print("-");
        System.out.println();
        for (Product w : products) {
            System.out.println(w.getId()+"\t"+w.getName()+"\t\t"+w.getFirma()+"\t\t"+w.getNumberofproduct()+
                    "\t\t"+w.getType()+"\t"+w.getWareHouse());
        }
    }
    public void yeniurungirisi() {
        System.out.println("urun id sini giriniz");
        String nid = scan.next();
        System.out.println("urun ismini giriniz");
        String nname = scan.next();
        System.out.println("urun firmasini giriniz");
        String nfirm = scan.next();
        System.out.println("urun miktar giriniz");
        int nmik = scan.nextInt();
        System.out.println("urun birimini giriniz");
        String nbirim = scan.next();
        System.out.println("urun rafino giriniz");
        String nraf = scan.next();
        getProducts().add(new Product(nid, nname, nfirm, nmik, nbirim, nraf));
        System.out.println();
        System.out.println("Id\t\tUrun adi\tUreticisi\tMiktari\t\tBirimi\t\tRaf");
        for (int i = 0; i < 60; i++)
            System.out.print("-");
        System.out.println();
        for (Product w : products) {
            System.out.println(w.getId() + "\t\t" + w.getName() + "\t\t\t" + w.getFirma() + "\t\t" + w.getNumberofproduct() +
                    "\t\t" + w.getType() + "\t" + w.getWareHouse());
        }
    }
    public void degistirme() {
        System.out.println("hangi urunu degistirmek istiyorsun? Id giriniz");
        String hid = scan.next();
        System.out.println("urunun hangi ozelligini degistirmek istiyorsun\nAdi:1 Firma:2 Adet:3 Tipi:4 rafi:5 r");
        int count = scan.nextInt();
        if (count == 1) {
            System.out.println("yeni isim giriniz");
            String rename = scan.next();
            for (Product w : products) {
                if (w.getId().equals(hid)) {
                w.setName(rename);
                }System.out.println(w.getName());
            }


        } else if (count == 2) {
            System.out.println("yeni firma ismi giriniz");
            String refirm = scan.next();
            for (Product w : products) {
                if (w.getId().equals(hid)) {
                    w.setFirma(refirm);
                }
            }
        } else if (count == 3) {
            System.out.println("yeni adeti giriniz");
            int readet = scan.nextInt();
            for (Product w : products) {
                if (w.getId().equals(hid)) {
                    w.setNumberofproduct(readet);
                }
            }
        } else if (count == 4) {
            System.out.println("yeni tipi giriniz");
            String retype = scan.next();
            for (Product w : products) {
                if (w.getId().equals(hid)) {
                    w.setType(retype);
                }
            }

        } else if (count == 5) {
            System.out.println("yeni rafi giriniz");
            String reraf = scan.next();
            for (Product w : products) {
                if (w.getId().equals(hid)) {
                    w.setWareHouse(reraf);
                }
            }

        }else System.out.println("gecerli bir islem seciniz");
        for (Product w : products) {
            System.out.println(w.getId() + "\t\t" + w.getName() + "\t\t\t" + w.getFirma() + "\t\t" + w.getNumberofproduct() +
                    "\t\t" + w.getType() + "\t" + w.getWareHouse());

        }
    }
}
