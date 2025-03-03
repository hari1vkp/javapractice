package scratch1;

import java.util.Scanner;

public class Checkzero {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a num");
        int n=scan.nextInt();
      //  System.out.println(zero(n,0));
        zero(n,0);
    }
    static void zero(int n,int count){
        if(n==0){
            return ;
        }
        int rem=n%10;
        if(rem==0){
        zero(n/10,++count);
        }
        System.out.println(count);
        

       
    }
}
