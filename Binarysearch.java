package scratch1;

import java.util.Scanner;

class Searchsort{
    static int binary(int[]arr,int tar){

        int left=0;
        int right=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int mid=(left+right)/2;
            if(arr[mid]==tar){
                return mid;
            }
            else {
                if(tar>arr[mid]){
                        left=mid+1;
                }
                else {
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {7, 8, 12, 15, 23, 28, 29};
        System.out.println("the array is");
        for(int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("enter target:");
        Scanner scan=new Scanner(System.in);
        int tar = scan.nextInt();
        int pos=Searchsort.binary(arr,tar)+1;//possition is  index+1 because position starts with 1 but index starts with 0
        if(pos==-1){
            System.out.println("given element is not presented in array");
        }
        else{
        System.out.println("the position is "+pos);}
    }
}
