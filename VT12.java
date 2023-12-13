import java.util.Scanner;

public class VT12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long a[] = new long[N];
        a[0] = input.nextLong();
        long max = a[0];
        long min = a[0];
        for(int i = 1; i < N; i++){
            a[i] = input.nextLong();
            if(a[i] > max) max = a[i];
            if(a[i] < min) min = a[i];
        }
        System.out.println(max - min);
        input.close();
    }
}
