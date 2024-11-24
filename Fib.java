package scratch1;

public class Fib {
    public static void main(String[] args) {


        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        Fib h=new Fib();
        System.out.println(fib[0]);
        System.out.println(fib[1]);
        h.fib(fib);
    }
    void fib(int []arr){
        for(int i=2;i<100;i++){
            arr[i]=arr[i-1]+arr[i-2];
            System.out.println(arr[i]);
        }
    }
}
