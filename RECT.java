import java.util.Scanner;

public class RECT {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long L = input.nextLong();
        long P = L/2;
        long S = (P/2) * (P - P/2);
        System.out.println(S);
        input.close();
    }
}
