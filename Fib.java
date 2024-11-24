package scratch1;

public class Fib {
    public static void main(String[] args) {


        int[] fib = new int[100];
        Fib h=new Fib();
        h.fib(fib);
    }
    void fib(int []arr){
        for(int i=0;i<10;i++){
            if(i==0 || i==1){
                arr[i]=i;
                System.out.println(arr[i]);

            }
            else {
                arr[i] = arr[i - 1] + arr[i - 2];
                System.out.println(arr[i]);
            }
        }


    }

}
