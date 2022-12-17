package pratikler;

public class Arraysayitoplamiaynioaln {
    public static void main(String[] args) {
        int sayilar[]=new int[]{26,24,22,28,45,5,36,34};
        int zop=50;
        for(int j=0;j<sayilar.length;j++){
            for (int i=j+1;i< sayilar.length;i++){
                if (sayilar[i]+sayilar[j]==zop){
                    System.out.println(sayilar[i]+"+"+sayilar[j]+"="+zop);

                }
            }



        }
        




    }
}
