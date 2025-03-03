package scratch1;
import  java.util.Random;
import java.util.Scanner;

public class Linearsearch
{
    public static void main(String[] args) {
        Random ram=new Random();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a size of an array");
        int i= scan.nextInt();
        int[]arr=new int[i];
        for(int h=0;h<i;h++){
            arr[h]=ram.nextInt(i);
            System.out.print(" "+arr[h]);
        }
        System.out.println();
        System.out.println("enter target");
        int tar= scan.nextInt();
        int result=linearsearch(arr,tar);
        if(result==-1){
            System.out.println("enter a value with in array");
        }
        else{
            System.out.println("the order of the value is"+(result+1));
        }

    }
    static int linearsearch( int[]arr,int tar) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                        return i;
            }
        }
        return -1;
    }
    }
//git remote add origin https://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@github.com//hari1vkp/javapractice.git

