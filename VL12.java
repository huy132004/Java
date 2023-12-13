import java.util.Scanner;

public class VL12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        in.close();
        System.out.println(n);
        for (long i = n/2; i >= 1; i++) {
            if(n % i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
