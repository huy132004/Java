import java.util.Scanner;

public class DK09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long year = in.nextLong();
        in.close();
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");
        }
    }
}
