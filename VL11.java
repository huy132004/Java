import java.util.Scanner;

public class VL11 {

    public static boolean isPrime(long n){
        if(n <= 1) return false;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        in.close();
        if (isPrime(n) == true) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
