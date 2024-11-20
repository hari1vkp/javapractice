package scratch1;
import java.util.Scanner;

public class Rank1v1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter the number of marks");
        int numofmarks=scan.nextInt();
        int[]ragav=new int[numofmarks];
        int[]hari=new int[numofmarks];
        int ragavcount=0;
        int counthari=0;
        System.out.println("ragav marks enter");
        for (int i = 0; i < numofmarks; i++)
        {
            System.out.print(" mark "+(i+1)+": ");
            ragav[i]= scan.nextInt();
        }
        System.out.println("hari marks enter");
        for (int i = 0; i < numofmarks; i++)
        {
            System.out.print(" mark "+(i+1)+" : ");
            hari[i]= scan.nextInt();
        }
        for (int i = 0; i < numofmarks ; i++) {
            if(hari[i]>ragav[i]){
                counthari++;
            } else if (hari[i]==ragav[i])
            {
                counthari++;
                ragavcount++;
            }
            else {
                ragavcount++;
            }

        }
        System.out.println("the result of 1v1 battle [ragev :  "+ragavcount+"   vs  hari:  "+counthari +" ]");

    }

}
