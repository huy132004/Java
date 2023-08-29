import java.util.Scanner;

public class VL01 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      in.close();
      for(int i = a; i <= b; i++){
        System.out.println(i + " ");
      }
    }
}
