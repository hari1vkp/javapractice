package scratch1;

import java.util.Scanner;

public class Printstarpattern {
    public static void main(String[] args) {
        int count=0;
        System.out.println("enter num of max no satrs in line for pattern");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        for (int i=0;i<num;i++){
            count++;

            System.out.println();
            for (int j=0;j<count;j++){
                System.out.print("*");

            }

        }
    }
}
