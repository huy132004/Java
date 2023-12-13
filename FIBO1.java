import java.util.Scanner;
import java.math.BigInteger;
public class FIBO1 {
    public static BigInteger[] dayFibo = new BigInteger[10001];
    public static void nhapDayFibo(){
        dayFibo[0] = BigInteger.ONE;
        dayFibo[1] = BigInteger.ONE;
        for(int i = 2; i <= 10000; i++){
            dayFibo[i] = dayFibo[i-1].add(dayFibo[i-2]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int[] stt = new int[T];
        for(int i = 0; i < T; i++){
            stt[i] = input.nextInt();
        }
        nhapDayFibo();
        for(int i = 0; i < T; i++){
            System.out.println(dayFibo[stt[i]]);
        }
        input.close();
    }
}
