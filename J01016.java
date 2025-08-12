import java.util.*;

public class J01016 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int cnt = 0;
        long n = r.nextLong();
        while(n > 0){
            long tmp = n%10;
            if(tmp == 4 || tmp == 7) cnt += 1;
            n /= 10;
        }
        if(cnt == 4 || cnt ==7) System.out.println("YES");
        else System.out.println("NO");
    }
}
