import java.util.Scanner;

public class DK01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        System.out.println(Math.max(a, b));
    }
}
