package scratch1;
import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=0;
        int avg=0;
      for(int i=1;i<=10;i++){
          System.out.println("give inputs:");
          a=a+ scan.nextInt();
          avg=a/i;
      }
        System.out.println("total "+a);
        System.out.println("avg"+avg);
    }}
