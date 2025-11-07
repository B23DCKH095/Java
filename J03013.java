import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t-- > 0 ){
            String a = r.next();
            String b = r.next();
            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger(b);
            Integer mx = Math.max(a.length(),b.length());
            x = x.subtract(y).abs();
            String u = x.toString();
            int mm = mx - u.length();
            while(mm-- > 0) System.out.print("0"); 
            System.out.println(u);
        }
    }
}
