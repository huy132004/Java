import java.util.Scanner;

public class MK119SNT {
    public static int[] sang = new int[1000001];
    public static void sangEratosthenes(){
        sang[0] = sang[1] = 0;
        for(int i = 2; i <= 1000000; i++){
            sang[i] = 1;
        }
        for(int i = 2; i*i <= 1000000; i++){
            if(sang[i] == 1){
                for(int j = i*2; j <= 1000000; j += i){
                    sang[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args){
        sangEratosthenes();
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            int count = 0;
            for(int j = l; j <= r; j++){
                if(sang[j] == 1) ++count;
            }
            System.out.println(count);
        }
    }
}
