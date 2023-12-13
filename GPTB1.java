import java.util.Scanner;

public class GPTB1{
    public static void solve(double a, double b, double c, double d, double e, double f){
        if(a/d == b/e && b/e == c/f){
            System.out.println("VOSONGHIEM");
            return;
        }
        if(a/d == b/e && b/e != c/f){
            System.out.println("VONGHIEM");
            return;
        }
        double x = (c*e - f*b) / (a*e - d*b);
        double y = (c - a*x) / b;
        System.out.printf("%.2f %.2f", x, y);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        solve(a, b, c, d, e, f);
        input.close();
    }
}