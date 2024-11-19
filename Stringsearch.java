package scratch1;
import java.util.Scanner;

public class Stringsearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String a = scan.next();
        System.out.println("enter a target");
        char b=scan.next().charAt(0);
        int possition=Lininstr.searchinstr(a,b)+1;// adding +1 to the index so we get position
        System.out.println("the possition letter is"+possition);
    }}
    class Lininstr{
    public  static int searchinstr(String a,char rar){
        if(a.length()==1){
            System.out.println("you know it");
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==(rar)){
                return i;
            }

        }
        return -1;

    }
}
