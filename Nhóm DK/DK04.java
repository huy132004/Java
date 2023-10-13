import java.util.Scanner;

public class DK04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        in.close();
        int b = (int) a;
        //Nếu a dương
        if (a > 0) {
            //Nếu phần thập phân >= 0.5 thì làm tròn lên (b công thêm 1)
            //Nếu phần thập phân < 0.5 thì làm tròn xuống (b giữ nguyên)
            if (a - 0.5 >= b) {
                ++b;
            }
        // Nếu a âm
        } else {
            //Nếu phần thập phân >= 0.5 thì làm tròn xuống (b trừ đi 1)
            //Nếu phần thập phân < 0.5 thì làm tròn lên (b giữ nguyên)
            if (a + 0.5 <= b) {
                --b;
            }

        }
        System.out.println(b);
    }
}
