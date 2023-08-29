import java.util.Scanner;

public class DK08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        String operator = in.next();
        double b = in.nextDouble();
        in.close();
        switch (operator) {
            case "+":
                System.out.printf("%.2f", a + b);
                break;
            case "-":
                System.out.printf("%.2f", a - b);
                break;
            case "*":
                System.out.printf("%.2f", a * b);
                break;
            case "/":
                if (b != 0) {
                    System.out.printf("%.2f", a / b);
                } else {
                    System.out.println("Math Error");
                }
                break;
            default:
                break;
        }

    }
}
