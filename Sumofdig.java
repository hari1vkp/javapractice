package scratch1;

import java.util.Scanner;

public class Sumofdig {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a dig");
        int dig=scan.nextInt();
        System.out.println(sumdig(dig));
    }
    static int sumdig(int dig){
        if(dig==0){
            return 0;
        }
        return sumdig(dig/10)+dig%10;
    }
}
