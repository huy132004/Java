import java.util.Scanner;

public class MAXSUM {
    public static void Kadane_Algorithm(long[] arr) {
        long sum = 0, sum_max = Long.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(sum >= 0) sum += arr[i];
            else sum = arr[i];
            sum_max = Math.max(sum_max, sum);
        }
        System.out.println(sum_max);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }
        Kadane_Algorithm(arr);
    }
}
