import java.util.Scanner;

public class VL19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        boolean check = false;
        for(int i = b-1; i > a; i--){
            if (i % 3 == 0) {
                check = true;
                System.out.print(i + " ");
            }
        }
        if(check == false){
            System.out.println("NOT FOUND");
        }
    }
}
