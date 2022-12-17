package day28abstraction;

public interface Engine {
    //interface deki tüm metotlar abstract olmalidir. abstract KEYWORDU NU YAZMAYA GEREK YOKTUR
    //interface deki tüm metotlar otomatik olarak publictir bu yuzden yazmaya gerek yoktur
//interface deki tüm metotlar abstract oldugu icn interface lere fully abstraction denir
    //interface lerin icinde concrete metot yapmak icin default keywordla yapariz
    //Yada statik yaparak yapabiliriz
    public static String uptade(String str){
        return str+"!";
    }
    public default int add(int a,int b){
        return a+b;
    }
    void eco();
    void gas();
    void tsi();

}
