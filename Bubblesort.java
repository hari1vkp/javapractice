package scratch1;

import java.util.Random;
import java.util.Scanner;
class BubbleSort{
    public static void bubble(int[]arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[j]>arr[j+1]) {
                    swap(arr,j);
                }
            }
        }
    }
    public static void swap(int[]arr,int j){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }

}

public class Bubblesort {
    public static void main(String[] args) {
        Random ram=new Random();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a size of an array");
        int i= scan.nextInt();
        int[]arr=new int[i];
        for(int h=0;h<i;h++){
            arr[h]=ram.nextInt(i);
        }
        System.out.println("before sorting");
        for(int h=0;h<i;h++){
            System.out.print("  "+arr[h]);
        }
        BubbleSort.bubble(arr);
        System.out.println();
        System.out.println("after");
        for(int h=0;h<i;h++){
            System.out.print("  "+arr[h]);
        }


}}
