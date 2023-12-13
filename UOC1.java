import java.util.Scanner;

public class UOC1 {
    public static void solve(long a, long b) {
        long sum = 0;
        for (long i = 2; i <= a; i++)
            if (a % i == 0 && b % i != 0) {
                sum += i;
            }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        solve(a, b);
        in.close();
    }
}
