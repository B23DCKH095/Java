import java.util.*;

public class J01021 {
    static int mod = 1000000007;  
    public static long pow(long a, long b) {
        if (b == 0) return 1 % mod;
        long x = pow(a, b / 2);
        if (b % 2 == 1) return (x % mod * x % mod * a % mod) % mod;
        return (x % mod * x % mod) % mod;
    }
    
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        while (true) {
            long a = r.nextLong();
            long b = r.nextLong();
            if (a == 0 && b == 0) break;
            long ans = pow(a, b);
            System.out.println(ans);  
        }
    }
}