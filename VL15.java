import java.util.Scanner;

public class VL15 {
    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        int GCD = UCLN(a, b);
        System.out.println(GCD);
    }
}
