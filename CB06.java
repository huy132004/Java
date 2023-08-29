import java.util.Scanner;

public class CB06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int CD = in.nextInt();
        int CR = in.nextInt();
        System.out.println((CD + CR) * 2);
        System.out.println(CD * CR);
        in.close();
    }
}
