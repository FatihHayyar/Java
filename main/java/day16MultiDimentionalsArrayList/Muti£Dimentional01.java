package day16MultiDimentionalsArrayList;

public class Muti£Dimentional01 {
    public static void main(String[] args) {
        //bir integer multi array olusturun. Bu arraydaki tum sayilarin toplamini veren kodu yazin
       int sum=0;
        int multi[][]={{3,5,7},{9,11},{13,15,17,19}};
        for (int [] w:multi){
            for (int k:w){
                sum+=k;
            }
        }
        System.out.println(sum);

    }
}
