import java.util.Scanner;

public class DK06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        if (a == 0 && b == 0) {
            System.out.println("WOW");
        } else if (a == 0 && b != 0) {
            System.out.println("NO");
        } else {
            System.out.printf("%.2f", (double) -b/a);
        }
    }
}
