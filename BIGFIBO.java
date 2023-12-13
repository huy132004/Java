import java.util.Scanner;

public class BIGFIBO {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a = 1, b = 1;
        for(long i = 2; i <= n; i++){
            long c = (a + b) % mod;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
