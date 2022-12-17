package pratikler;

public class IlkSonEsitmi {
    public static void main(String[] args) {
        String words[] = new String[]{"Antalya", "Zonguldak", "Rize", "Erzurum", "Karabük"};
for (String w:words){
    if (w.toLowerCase().charAt(0)==w.toLowerCase().charAt(w.length()-1)){
        System.out.println(w);
    }




}





    }}