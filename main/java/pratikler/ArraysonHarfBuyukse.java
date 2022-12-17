package pratikler;

public class ArraysonHarfBuyukse {
    public static void main(String[] args) {
        String names[]=new String[]{"osman","furkan","emine","betul","ümmü","gülsum","fatih","gülsah"};
        for (String w: names){

            if (w.endsWith("n")){
                System.out.println(w.charAt(0));
            }if (w.startsWith("f")){
                System.out.println(w.charAt(w.length() - 1));

            }
        }




    }
}
