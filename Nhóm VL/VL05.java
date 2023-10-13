import java.util.Scanner;

public class VL05 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      in.close();
      long sum = 0;
      for(int i = 1; i <= 3*n+1; i++){
        if(i % 2 == 0) {
          sum -= i;
        } else {
          sum += i;
        }
      }
      System.out.println(sum);
    }
}
