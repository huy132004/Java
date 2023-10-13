import java.util.Scanner;

public class VL09 {
  
    public static long Factorial(int n){
      long factorial = 1;
      for(int i = 1; i <= n; i++){
        factorial *= i;
      }
      return factorial;
    }
    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int n = in.nextInt();
      in.close();
      
      double sum = 0.0;
      for(int i = 1; i <= n; i++){
        sum += Math.pow(x,i) / Factorial(i);
      }
      
      System.out.printf("%.2f", sum);
    }
}
