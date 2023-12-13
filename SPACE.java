import java.util.Scanner;

public class SPACE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        String[] s = new String[T];
        for(int i = 0; i < T; i++){
            s[i] = in.nextLine();
            int cnt = 0;
            for(int j = 0; j < s[i].length()-1; j++){
                if(s[i].charAt(j) == ' ' && s[i].charAt(j+1) != ' ') ++cnt;
            }
            System.out.println(cnt);
        }
        in.close();
    }
}
