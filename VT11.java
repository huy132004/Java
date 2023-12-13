import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class VT11{
    public static List<Integer> list1 = new ArrayList<>();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int a[] = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = input.nextInt();
            if(i != 0 && i != N-1){
                list1.add(a[i]);
            }
        }
        Collections.sort(list1);
        input.close();
        System.out.print(a[0] + " ");
        for(int i : list1){
            System.out.print(i + " ");
        }
        System.out.println(a[N-1]);
    }
}
