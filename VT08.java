import java.util.Scanner;

public class VT08{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long[] a = new long[N+2];
        a[0] = a[N+1] = 0;
        for(int i = 1; i <= N; i++){
            a[i] = input.nextLong();
        }
        input.close();
        for(int i = 1; i <= N; i++){
            if(i % 2 == 0){
                a[i] += Math.abs(a[i-1] - a[i+1]);
            }
        }
        for(int i = 1; i <= N; i++){
            System.out.print((a[i]) + " ");
        }
        System.out.println();
    }
}
