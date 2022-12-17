package day27CompileTimeExceptions;

public class Exceptions03 {
    public static void main(String[] args) throws IllegalGradeException {

       printGrade(120);
checkNameFormat("Fatih");
    }
    //ogrenci notlarini yazdiran metodu yapin
    public static void printGrade(int not) throws IllegalGradeException {
        if(not<0||not>100){
            throw new IllegalGradeException("dogru not gir");
        }else
        System.out.println(not);
    }
    //verilen ismin ilk harfinin buyuk harf olmamasi durumunda exception atan metot yazin
    public static boolean checkNameFormat(String name){
        if(name.charAt(0) <='Z'&&name.charAt(0) >='A'){
            return true;
        }else{
        throw new IllegalNameException("isimler buyuk harfle baslar");
        }
    }
}
/* bizde app lerde kendi exceptionlarimizi olusturarak diger dev lerin bizim koydugumuz kurallara
uymalarini temin ederiz
bizim urettigimiz exceptionlara custo exception denir. Custom larda  runtime veya compile olabilir
custom exception icin extend ile exception a baglariz

 */