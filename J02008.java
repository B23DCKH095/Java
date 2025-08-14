import java.util.*;
public class J02008 {
    public static long gcd(long a,long b){
        if(b != 0) return gcd(b,a%b);
        return a;
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t > 0){
             t-= 1;
             long x = 1;
             int n = r.nextInt();
             for(int  i =2; i <= n ; i++){
                if(x%i != 0) x *= i/gcd(i,x);
             }
             System.out.printf("%d\n",x);
        }
    }
}
