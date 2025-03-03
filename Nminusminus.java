package scratch1;

public class Nminusminus {
    public static void main(String[] args) {
        minus(5);
    }
    static void minus(int n){
        if(n==0){
            return;
        }

        minus(n--);
        System.out.println(n);
    }
}
