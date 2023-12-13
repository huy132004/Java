import java.util.Scanner;

public class VL16 {
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        int UCLN = GCD(Math.abs(a), Math.abs(b));
        int BCNN = Math.abs(a) * Math.abs(b) / UCLN;
        System.out.println(BCNN);
    }
}
