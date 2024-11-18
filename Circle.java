package scratch1;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("enter a radius:");
        Scanner scan=new Scanner(System.in);
        double rad= scan.nextFloat();
        double area= 3.14*(rad*rad);
        double perimeter=2*3.14*rad;
        System.out.println("the perimeter of circle is "+perimeter);
        System.out.println("the area of circle is "+area);


    }
}
