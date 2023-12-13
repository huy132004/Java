import java.util.Scanner;

public class VL07 {
  static long C(int n, int k) {
    if(k == 1 || k == n) return 1;
    return C(n-1, k-1) + C(n-1, k);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    in.close();
    long result = C(n, k);
    System.out.println(result);
  }
}
