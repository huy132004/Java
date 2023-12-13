import java.util.Scanner;

public class VL18 {
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        //Nhập chuỗi đầu vào
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        in.close();
        //Đảo ngược chuỗi
        String num_reversed = reverseString(num);
        //Loại bỏ các số 0 đứng đầu
        while (num_reversed.charAt(0) == '0') {
            num_reversed = num_reversed.substring(1);
        }
        //In chuỗi
        System.out.println(num_reversed);
    }
}
