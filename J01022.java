import java.util.*;

public class J01022 {
    static long[] f = new long[94];  // made static
    
    public static void init() {
        f[1] = 1;
        f[2] = 1;
        for(int i = 3; i <= 93; i++) {  // changed to 93 to avoid array index out of bounds
            f[i] = f[i-1] + f[i-2];
        }
    }
    
    public static int fin(int n, long k) {  // changed k parameter to long
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k < f[n-2]) return fin(n-2, k);
        else return fin(n-1, k - f[n-2]);  // fixed the array index
    }
    
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        init();  // initialize the Fibonacci array first
        int t = r.nextInt();
        while(t > 0) {
            t -= 1;
            int n = r.nextInt();
            long k = r.nextLong() - 1;  // converted to 0-based index
            int ans = fin(n, k);
            System.out.println(ans);
        }
    }
}