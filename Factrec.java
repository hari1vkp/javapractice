package scratch1;

import java.util.Scanner;

public class Factrec {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a num:");
    int n=scan.nextInt();
        System.out.println("output");
    System.out.println(fact(n));
    }
    static int fact(int n){
        if (n<1){
            return 1;
        }
        return (n*fact(n-1));

    }

}
