import java.util.Scanner;

public class VL04 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      in.close();
      double sum = 0.0;
      for(int i = 2; i <= n; i++){
        sum += 1.0/i;
      }
      System.out.printf("%.4f", sum);
    }
}
