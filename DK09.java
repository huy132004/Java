import java.util.Scanner;

public class DK09 {
    public static boolean ktraNamNhuan(long year){
        if(year % 400 == 0) return true;
        if(year % 100 == 0) return false;
        if(year % 4 == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long year = in.nextLong();
        in.close();
        if(0 < year && year <= 100000){
            if(ktraNamNhuan(year)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("INVALID");
        }
    }
}
