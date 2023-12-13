import java.util.Scanner;

public class VT07{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long a[] = new long [10];
        for(int i = 0; i < 10; i++){
            a[i] = input.nextLong();
        }
        long num = input.nextLong();
        input.close();
        boolean check = false;
        for(int i = 0; i < 10; i++){
            if(a[i] == num){
                check = true;
                System.out.print((i+1) + " ");
            }
        }
        if(check == false) System.out.print(-1);
        System.out.println();
    }
}
