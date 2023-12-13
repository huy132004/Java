import java.util.Scanner;

public class PALINZ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int t = in.nextInt();
        for(int i = 0; i < t; i++){ 
            int l = in.nextInt();
            int r = in.nextInt();
            StringBuilder s_con = new StringBuilder();
            for (int j = l - 1; j < r; j++) {
                s_con.append(s.charAt(j));
            }
            StringBuilder s_con_rev = new StringBuilder(s_con);
            s_con_rev.reverse();
            if (s_con.toString().equals(s_con_rev.toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        }
        in.close();
    }
}