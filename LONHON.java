import java.util.Scanner;

public class LONHON {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int year = 0;
        while(true){
            if(a > b) break;
            ++year;
            a *= 3;
            b *= 2;
        }
        System.out.print(year);
    }
}
