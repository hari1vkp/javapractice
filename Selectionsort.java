package scratch1;

import java.util.Random;
import java.util.Scanner;
class Selectionsorting{
   public static void sort(int arr[]){
       for (int i=0;i< arr.length-1;i++){
           int count=i;
           for (int j=i+1;j< arr.length;j++){
               if (arr[j]<arr [count]){
                   count=j;
               }
           }
          swap(arr,count,i);
           System.out.println();
           for (int k = 0; k < arr.length ; k++) {

               System.out.print(" "+arr[k]);
           }
       }
   }
    public static void swap(int[]arr,int j,int i){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}

public class Selectionsort
{
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
        Selectionsorting.sort(arr);
        System.out.println();
        System.out.println("sorted array");
        for (int k = 0; k < size ; k++) {

            System.out.print(" "+arr[k]);
        }
    }
}
