import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class VT16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        int num;
        do{
            num = input.nextInt();
            if(num < 0) list1.add(num);
        } while(num != 0);
        if(list1.size() > 0){
            for (int i : list1) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print("NOT FOUND");
        }
        System.out.println();
        input.close();
    }
}
