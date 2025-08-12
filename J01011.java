import java.util.Scanner;

public class J01011 {
    public static long lcm(long a,long b){
        return (a/gcd(a,b))*b;
    }
    public static long gcd(long a,long b){
        if(b != 0) return gcd(b,a%b);
        return a;
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t > 0){
            t-=1;
            int a = r.nextInt();
            int b = r.nextInt();
            long ans = gcd(a,b);
            long lc = lcm(a,b);
            System.out.printf("%d %d\n",lc,ans);
        }
        r.close();
    }
}
