package Supermarket;

import java.util.ArrayList;
import java.util.List;

public class Product extends MainRunner {
    private String id;
    private String name;
    private String firma;
    private int numberofproduct;
    private String type;
    private String wareHouse;
    private List<Product> products=new ArrayList<>();

    public Product(String nid, String nname, String nfirm, int nmik, String nbirim, String nraf) {
        this.id = nid;
        this.name = nname;
        this.firma = nfirm;
        this.numberofproduct = nmik;
        this.type = nbirim;
        this.wareHouse = nraf;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        firma = firma;
    }

    public int getNumberofproduct() {
        if (numberofproduct<0){
           return numberofproduct=0;
        }else
        return numberofproduct;
    }

    public void setNumberofproduct(int numberofproduct) {
        this.numberofproduct = numberofproduct;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(String wareHouse) {
        this.wareHouse = wareHouse;
    }

    public Product() {
        this.id = id;
        this.name = name;
        this.firma = firma;
        this.numberofproduct = numberofproduct;
        this.type = type;
        this.wareHouse = wareHouse;
    }

}
