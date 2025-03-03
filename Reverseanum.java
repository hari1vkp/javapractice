package scratch1;

public class Reverseanum {
    public static void main(String[] args) {
        int n=65476;
        int b=rev(n);
        System.out.println(b);
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
