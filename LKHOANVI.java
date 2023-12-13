import java.util.Scanner;

public class LKHOANVI {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void solve(int[] a, int[] a_end, int n) {
        System.out.println(a);
        int pos1 = 0, pos2 = 0;
        while(a != a_end) {
            for(int i = 0; i < n-1; i++){
                if(a[i] < a[i+1]) pos1 = i;
            }
            for(int i = pos1; i < n; i++){
                if(a[i] > a[pos1]) pos2 = i;
            }
            swap(a[pos1], a[pos2]);
            int left = pos1 + 1, right = n-1;
            while(left < right){
                swap(a[left], a[right]);
                left++;
                right--;
            }
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] a_end = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = i+1;
            a_end[i] = n - i;
        }
        solve(a, a_end, n);
    }
}
