import java.util.Scanner;

public class DK05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        in.close();
        long b = (int) Math.sqrt(a);
        if(b * b == a){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
