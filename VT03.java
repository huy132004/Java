import java.util.*;

public class VT03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = input.nextLong();
        }
        input.close();
        int softmax = 0;
        for (int i = 1; i < N; i++) {
            if (a[i] >= a[softmax]) {
                softmax = i;
            }
        }
        System.out.println(softmax);
    }
}
