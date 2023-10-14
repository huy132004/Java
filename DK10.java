import java.util.Scanner;

public class DK10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();
        in.close();
        if (year <= 0 || year > 100000) {
          System.out.println("INVALID");
        } else {
          switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
              System.out.println(31);
              break;
            case 4: case 6: case 9: case 11:
              System.out.println(30);
              break;
            case 2:
              if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 != 0) {
                  System.out.println(28);
                } else {
                  System.out.println(29);
                }
              } else {
                System.out.println(28);
              }
              break;
            default:
              System.out.println("INVALID");
          }
        }
    }
}
