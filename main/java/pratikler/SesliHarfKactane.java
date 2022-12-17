package pratikler;

public class SesliHarfKactane {
    public static void main(String[] args) {
        String s="Anlayana sivrisinek saz, anlamayana davul zurna az";
        String arr[]=s.toLowerCase().split(" ");
        int caunter=0;
        for (String w:arr){
            for (int k=0;k<w.length();k++){
switch (w.substring(k,k+1)){
    case "a":
    case "e":
    case "i":
    case "o":
    case "u":
   caunter++;
}}




        }
        System.out.println(caunter);




    }
}
