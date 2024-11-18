package scratch1;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter a num");
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        int temp=a;
        while (a>1){
            a--;
            temp=temp*a;


        }
        System.out.println("factorial of num");
        System.out.println(temp);
    }
}
