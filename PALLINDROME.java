package scratch1;
import  java.util.Scanner;

public class PALLINDROME {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String a = scan.next();
        int left=0;
        int right= a.length()-1;
        boolean p=true;
        while (left<right){
            if(a.charAt(left)==a.charAt(right)){
                left++;
                right--;
                p=true;
            }
            else {
                p=false;
                break;
            }

        }
        if(p==true){
            System.out.println("give is pallindrome");
        }
        else {
            System.out.println("not pallindrome");
        }



    }
}
