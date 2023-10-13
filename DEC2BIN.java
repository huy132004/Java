import java.util.Scanner;

public class DEC2BIN {
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T > 0) {
            long n = in.nextLong();
            String binary_reversed = "";
            while(n > 0){
                char kitu = (char) (n % 2 + '0');
                binary_reversed += kitu;
                n /= 2;
            }
            String binary = reverseString(binary_reversed);
            System.out.println(binary);
            T--;
        }   
        in.close();
    }
}
