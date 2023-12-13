import java.util.Scanner;

public class VT06{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long[] a = new long[N];
        for(int i = 0; i < N; i++){
            a[i] = input.nextLong();
        }
        input.close();
        double sum = 0.0;
        int demSoLe = 0;
        for(int i = 0; i < N; i++){
            if(Math.abs(a[i]) % 2 == 1){
                sum += a[i];
                ++demSoLe;
            }
        }
        double tbc = sum / demSoLe;
        System.out.printf("%.4f\n", tbc);
    }
}
