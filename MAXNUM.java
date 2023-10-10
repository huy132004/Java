import java.util.Scanner;

public class MAXNUM {
    public void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c < '0' || c > '9'){
                c = ' ';
            }
        }
        in.close();
        Scanner divide_num = new Scanner(s);
        divide_num.close();
        
    }
}