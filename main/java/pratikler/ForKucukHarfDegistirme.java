package pratikler;

public class ForKucukHarfDegistirme {
    public static void main(String[] args) {
        String al= "MateMatiK";
        al=al.replaceAll("[^a-z]","");
        String news="";
        for (int i=0; i<al.length(); i++) {
         String c=al.substring(i,i+1);
         news=news+c+"*";


        }
        System.out.println(news);


    }


}
