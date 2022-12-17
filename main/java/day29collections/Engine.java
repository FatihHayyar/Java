package day29collections;


public interface Engine extends Vehicle {
    //interface child olursa parenta extends ile baglanir. ama bir interface in parenti class olamaz interface olabilir
    //interface lerdeki tum variable lar otomatik publictir.
    //interface lerdeki tum variable lar otomatik final dir. yani degeri degistiremezsiniz
    //interface lerdeki tum variable lar otomatik static tir.
    // interface lerde constracter olmadigi icin objectt olusturulamaz
    //abstract class larda class oldugu icin constracter vardir.
    // ama constracter lar abstract classlarda object olusturamaz
    /* Abstract class ile interface in farki
    1.Abstract class hem abstract hemde concrete methodlar icerebilir.
    interface ler ise sadece abstract methodlar icerir. ama istersek interface icinde de
    default ve static keywrdlar kullanarak concrete methodlar olusturabiliriz
    2.Abstract classlarda herturlu variable olusturabiliriz
    interfacelerde ise variable lar public static final olmak zorundadir.
    3.abstract classlar class oldugu icin multiple inheritance e müsade etmezler.
    interfacelerde ise multiple inheritance desteklenir.
    4. Abstract classlarda constructor vardir ama object olusturmada kullanilmazlar
    interfacelerde ise constructor yoktur
soru: object oriented programming language prensipleri nelerdir?
1. inheritance
2.Polimorfizm
3.encapsulation
4.abstraction
     */
    int price=20000;
    void run();

}
