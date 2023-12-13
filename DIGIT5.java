import java.util.Scanner;

public class DIGIT5 {
    public static long count_5 = 0;
    public  static void solve(long i){
        while(i > 0){
            if(i % 10 == 5) ++count_5;
            i /= 10;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long m = input.nextLong();
        long n = input.nextLong();
        for(long i = m; i <= n; i++){
            solve(i);
        }
        System.out.println(count_5);
    }
}
