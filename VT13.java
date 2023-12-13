import java.util.Scanner;

public class VT13{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long num[] = new long[N];
        for(int i = 0; i < N; i++){
            num[i] = input.nextInt();
        }
        input.close();
        long sum_max = num[0] - num[1];
        int pos = 0;
        for(int i = 1; i < N-1; i++){
            if(num[i] + num[i+1] >= sum_max){
                sum_max = num[i] + num[i+1];
                pos = i;
            }
        }
        // TH đặc biệt tổng 2 số cuối và đầu
        if(num[N-1] + num[0] >= sum_max){
            sum_max = num[N-1] + num[0];
            pos = N-1;
        }
        if(pos != N-1){
            System.out.println((num[pos]) + " " + (num[pos+1]));
        } else {
            System.out.println((num[N-1]) + " " + (num[0]));
        }
    }
}
