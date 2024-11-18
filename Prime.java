package scratch1;

public class Prime {
    public static void main(String[] args) {
      for(int i=0;i<100;i++) {
          int a = 0;
          for (int c = 2; c < i; c++) {
              if (i % c == 0) {
                  a = a + 1;
              }
          }
          if (a == 0) {
              System.out.println("prime nums are " + i);
          }
      }
    }
}
