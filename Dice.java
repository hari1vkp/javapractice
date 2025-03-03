package scratch1;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("give target we will find you ways");
        int tar=scan.nextInt();
        dice("",tar);
    }
    static void dice(String p,int tar){
        if (tar==0){
            System.out.println(p);
            return;
        }
        for (int i=1;i<=6&&i<=tar;i++){
            dice(p+i,tar-i);
        }
    }
}
