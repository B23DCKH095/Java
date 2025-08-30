import java.util.*;

public class J02008{
    public static long gcd(long a,long b){
        if(b != 0) return gcd(b,a%b);
        return a;
    }
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        int t = r.nextInt();
        while(t-- > 0){
            long n = r.nextLong();
            long s = 1;
            for(int i = 1; i <= n; i++){
                if(s%i != 0) s *= i/gcd(i,s);
            }
            System.out.println(s);
        }
    }
}