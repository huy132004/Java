import java.util.*;

public class NPALIN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long l = input.nextLong();
        long r = input.nextLong();
        long count = 0;
        for(long i = l; i <= r; i++){
            String num = Long.toString(i);
            StringBuilder num_reverse = null;
            for(int j = num.length(); j >= 0; j--){
                num_reverse.append(num.charAt(j));
            }
            if(num.contentEquals(num_reverse)){
                ++count;
            }
        }
        System.out.println(count);
    }
}
