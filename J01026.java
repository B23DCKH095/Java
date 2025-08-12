import java.util.*;

public class J01026 {
    public static boolean check(int n){
        int x = (int)Math.sqrt(n);
        if(x*x == n) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t > 0){
            t -= 1;
            int n = r.nextInt();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
        r.close();
    }
}
