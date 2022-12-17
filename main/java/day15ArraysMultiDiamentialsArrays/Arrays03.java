package day15ArraysMultiDiamentialsArrays;

public class Arrays03 {
    public static void main(String[] args) {
        //bir string deki sesli harflerin sayisini bulun
        String str="Kurt kisi gecirir, yedigi ayazi unutmaz.";
        String starr[]=str.toLowerCase().split("");
        int counter=0;
        for (String w:starr){
            switch (w){
                case "a":case "e":case "i":case "o":case "u":
                    counter++;
            }
        }
        System.out.println(counter);
        //2.yol
int c=str.length()-str.replaceAll("[aeiouAEIOU]","").length();

        System.out.println(c);

    }
}
