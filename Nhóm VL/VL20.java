import java.util.Scanner;

public class VL20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        char b = in.next().charAt(0);
        in.close();
        if(a > b){
            char temp = a;
            a = b;
            b = temp;
        }
        for (char i = a; i <= b; i++) {
            System.out.print((char)(i - 32) + " ");
        }
        
    }
}
