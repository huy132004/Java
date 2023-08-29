import java.util.Scanner;

public class CB07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        final double pi = 3.140;
        in.close();
        System.out.printf("%.3f ", 2 * pi * r);
        System.out.printf("%.3f", pi * r * r);

    }
}
