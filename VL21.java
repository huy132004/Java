import java.util.Scanner;

public class VL21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        in.close();
        long n = 0;
        while(n * n + n <= 2 * N){
            ++n;
        }
        System.out.println(n-1);
    }
}
