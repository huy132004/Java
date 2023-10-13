import java.util.Scanner;

public class VL10 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String num = in.nextLine();
    in.close();
    while (num.charAt(0) == '0' || num.charAt(0) == '-') {
      num = num.substring(1);
      if(num.length() == 0) break;
    }
    System.out.println(num.length());
  }
}
