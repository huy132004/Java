import java.util.Scanner;

public class VL03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i = 2; i <= n; i++){
            sum += i;
        }
        sum += 2*n;
        System.out.println(sum);
        in.close();
    }
}
