import java.util.Scanner;

public class VL13 {
    static int solve(long n){
        long sum = 0;
        long n_temp = n;
        for(int i = 2; i*i <= n; i++){
            if(n_temp % i == 0){
                sum += i;
                n_temp /= i;
            }
        }
        if(n_temp > 1) sum += n_temp;
        if(sum == n) return 1;
        return 0;
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if(solve(n) == 1){
            System.out.println("YES");
        } else {
                System.out.println("NO");
            }
            input.close();
        }
    }