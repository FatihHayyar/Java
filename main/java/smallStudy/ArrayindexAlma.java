package smallStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayindexAlma {
    public static void main(String[] args) {
int a=111011;
int b=1;
int top=0;
 int top2=0;

for(int i=a;i>0;i=i/10){
    top++;
}int arr[]=new int[top];
        for(int k=b;k>0;k=k/10){
            top2++;
        }int brr[]=new int[top2];
for (int i=0;i<top;i++){
    arr[top-1-i]=a%10;
    a=a/10;
}for (int l=0;l<top2;l++){
            brr[top2-1-l]=b%10;
            b=b/10;
        }System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

int buyuk=0;
int kucuk=0;
        if (top<top2){
            buyuk=top2;
            kucuk=top;
        }else {
            buyuk=top;
            kucuk=top2;
        }int toparr[]=new int[buyuk+2];
       
        for (int k=kucuk-1;k>-1;k--){
            toparr[buyuk+1-k]=arr[kucuk-1-k]+brr[kucuk-1-k];
        }


        for (int w=buyuk+1;w>-1;w--){
           if (toparr[w]==2){
               toparr[w]=0;
               toparr[w-1]++;
           }
            if (toparr[w]==3){
                toparr[w]=1;
                toparr[w-1]++;
            }

        }
        System.out.println(Arrays.toString(toparr));





    }
}
