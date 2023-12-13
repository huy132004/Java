import java.util.Scanner;

public class SUBSUM {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long x = (a + b) / 2;
        long y = a - x;
        System.out.println(x + " " + y);
    }
}
