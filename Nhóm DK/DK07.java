import java.util.Scanner;

public class DK07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        double delta = b * b - 4 * a * c;
        //Nếu a == 0 giải bx + c = 0 như pt bậc 1
        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("WOW");
            } else if (b == 0 && c != 0) {
                System.out.println("NO");
            } else {
                System.out.printf("%.2f", (double) -c / b);
            }
        //Nếu a != 0 giải pt bậc 2
        } else {
            if (delta < 0) {
                System.out.println("NO");
            }
            if (delta == 0) {
                System.out.printf("%.2f", -b / (2 * a));
            }
            if (delta > 0) {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf("%.2f %.2f", x1, x2);
            }
        }
        System.out.println();
    }
}
