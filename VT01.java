import java.util.Scanner;

public class VT01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        in.close();

        long max = a[0];
        for (int i = 0; i < n; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
