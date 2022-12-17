package pratikler;

public class IfliSekilli {
    public static void main(String[] args) {

        for(int i=1; i<5; i++){
            String s = "";
            if(i==1){
                for(Integer k=1; k<9; k++){
                    s = s + "A ";
                }
                System.out.println(s);
            }else{
                s = s + "A ";
                for(Integer m=2; m<8; m++){
                    s = s + "X ";
                }
                s = s + "A ";
                System.out.println(s);
            }
        }



    }
}
