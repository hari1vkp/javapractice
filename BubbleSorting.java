package scratch1;

import java.util.Random;
import java.util.Scanner;
class  Bubble{
  static  void bubb(int[]ar){
        for (int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length-1-i;j++){
                if (ar[j] > ar[j+1]) {
                    swap(ar,j);
                }
            }
        }
  }
  static  void swap(int[]arr,int j){
      int temp=arr[j];
      arr [j]=arr[j+1];
      arr [j+1]=temp;

    }

}

public class BubbleSorting {
    public static void main(String[] args) {
        Random ran=new Random();
        System.out.println("enter the of array");
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
        int[]arr=new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i]= ran.nextInt(size);
        }
        System.out.println("unsorted array");
        for (int i = 0; i < size ; i++) {

            System.out.print(" "+arr[i]);
        }
        Bubble.bubb(arr);
        System.out.println();
        System.out.println("sorted array");
        for (int i = 0; i < size ; i++) {

            System.out.print(" "+arr[i]);
        }


    }
}
