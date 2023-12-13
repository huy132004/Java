import java.util.Scanner;

public class VT02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long[] num = new long[N];
        for (int i = 0; i < N; i++) {
            num[i] = input.nextLong();
        }
        input.close();
        int i;
        // Code tổng quát tìm vị trí lớn thứ tự yêu cầu
        // Đặt pos = 2 tức tìm vị trí lớn thứ 2
        int pos = 2;
        for (i = 0; i < pos; i++) {
            int max_position = i;
            for (int j = i + 1; j < N; j++)
                if (num[j] > num[max_position]) {
                    max_position = j;
                }
            long temp = num[i];
            num[i] = num[max_position];
            num[max_position] = temp;
        }
        if (num[pos - 1] == num[pos - 2]) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println(num[pos - 1]);
        }
    }
}
