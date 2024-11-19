package scratch1;

import java.util.Random;
import java.util.Scanner;
class Reversefun{
    public void revi(int[]arr){
        int left=0;
        int right=arr.length-1;
        int li=left;
        int ri=right;
        int mid=arr.length/2;

        for(int i=0;i<arr.length;i++){

            if(arr[li]==arr[mid]){
                break;
            }
            else{
                swap(arr,li,ri);
                li++;
                ri--;

            }
        }
        System.out.println("AFTER REV");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}

public class Reversearray {


    public static void main(String[] args) {
        Random ran=new Random();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a size");
        int a=scan.nextInt();
        int[]arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=ran.nextInt(10);
        }
        System.out.println("BEFORE REV");
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+"  ");
        }

        Reversefun rev=new Reversefun();
        rev.revi(arr);

    }


}
