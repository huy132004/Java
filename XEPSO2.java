import java.util.Scanner;

public class XEPSO2 {
    public static int[] queDiem = new int[10];

    public static void setQueDiem() {
        queDiem[0] = 6;
        queDiem[1] = 2;
        queDiem[2] = 5;
        queDiem[3] = 5;
        queDiem[4] = 4;
        queDiem[5] = 5;
        queDiem[6] = 6;
        queDiem[7] = 3;
        queDiem[8] = 7;
        queDiem[9] = 6;
    }
    public static long demSoQueDiem(long i){
        long result = 0;
        while(i > 0){
            long a = i % 10;
            result += queDiem[(int) a];
            i /= 10;
        }
        return result;
    }
    public static void solve(long l, long r){
        long soQueDiemMin = demSoQueDiem(l);
        long soQueDiemMax = soQueDiemMin;
        for(long i = l+1; i <= r; i++){
            long soQueDiem = demSoQueDiem(i);
            if(soQueDiem > soQueDiemMax){
                soQueDiemMax = soQueDiem;
            }
            if(soQueDiem < soQueDiemMin){
                soQueDiemMin = soQueDiem;
            }
        }
        System.out.println(soQueDiemMin + " " + soQueDiemMax);
    }
    public static void main (String[] args){
        setQueDiem();
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            long l = in.nextLong();
            long r = in.nextLong();
            solve(l,r);
        }
    }
}
