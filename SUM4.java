import java.util.Scanner;

public class SUM4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T > 0){
            int n = in.nextInt();
            double tong = 0.0d;
            int mau = 0;
            for(int i = 1; i <= n; i++){
                mau += i;
                tong += (double) 1/mau;
            }
            System.out.printf("%.8f", tong);
            System.out.println();
            --T;
        }
        in.close();
    }
}