import java.util.Scanner;

public class VT04 {
    static int check(long[] a, long num, int N){
        for(int i = 0; i < N; i++){
            if(num == a[i]) return 1;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long num = input.nextInt();
        long[] a = new long[N];
        for(int i = 0; i < N; i++){
            a[i] = input.nextLong();
        }
        if(check(a, num, N) == 1){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        input.close();
    }
}
