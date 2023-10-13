import java.util.Scanner;

public class VL08 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      in.close();
      long sum = 0;
      for (int i = a; i <= b; i++){
        if(i % 2 == 0){
          sum += i;
        }
      }
      System.out.println(sum);
    }
}
