import java.util.Scanner;

public class CB04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (b == 0) {
            System.out.println("ERROR");
        } else {
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.printf("%.2f", (double) a / b);
        }
        in.close();
    }
}
