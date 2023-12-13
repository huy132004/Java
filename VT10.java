import java.util.*;

public class VT10{
    public static List<Integer> list1 = new ArrayList<>();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = input.nextInt();
            list1.add(a[i]);
        }
        list1.sort(Collections.reverseOrder());
        input.close();
        for(int i : list1){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
