package scratch1;

import java.util.Scanner;

public class Pallindrome {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter a num");
            int n=scan.nextInt();
            System.out.println("output after reverse");
            int b=rev(n);
            System.out.println(b);
            if(n==b){
                System.out.println("pallindrome");
            }
            else {
                System.out.println("not pallindrome");
            }
        }
        static int sum=0;
        static int rev(int n){
            if(n==0){
                return 0;
            }
            int rem=n%10;
            sum=(sum*10)+(rem);
            rev(n/10);
            return sum;

        }
    }

