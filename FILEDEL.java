import java.util.ArrayList;
import java.util.Scanner;

public class FILEDEL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Đọc số lượng từ và số lượng ký tự cần kiểm tra
        int n = in.nextInt();
        int q = in.nextInt();

        // Khởi tạo danh sách từ
        ArrayList<String> words = new ArrayList<>();

        // Đọc từng từ từ người dùng và thêm vào danh sách
        for (int i = 0; i < n; i++) {
            words.add(in.next());
        }

        // Khởi tạo mảng ký tự
        char[] letters = new char[q];

        // Đọc từng ký tự từ người dùng và thêm vào mảng
        for (int i = 0; i < q; i++) {
            letters[i] = in.next().charAt(0);
        }

        // Kiểm tra và in số lượng từ sau khi loại bỏ
        for (char letter : letters) {
            for (int i = 0; i < n; i++) {
                String word = words.get(i);
                if (word.contains(String.valueOf(letter))) {
                    words.remove(i);
                    --i;
                }
            }
            System.out.println(words.size());
        }
    }
}
