package scratch1;
import java.util.Scanner;
import  java.util.Random;

public class Arrayadd {
    public static void main(String[] args) {
        System.out.println("enter a size of an array");
        Scanner scan=new Scanner(System.in);
        int i= scan.nextInt();
        int[]arr=new int[i];
        Random ram=new Random();

        for(int h=0;h<i;h++){
            arr[h]=ram.nextInt(i);
            System.out.println(" "+arr[h]);
        }
        int add=0;
        for(int h=0;h<i;h++){
            add=arr[h]+add;

        }
        System.out.println(add);
    }
}
