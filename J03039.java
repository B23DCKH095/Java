import java.math.BigInteger;
import java.util.*;
public class J03039 {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        int t = r.nextInt();
        while(t > 0){
            t-= 1;
            String a = r.next();
            String b = r.next();
            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger(b);
            BigInteger c = new BigInteger("0");
            if((x.mod(y)).equals(c) || (y.mod(x)).equals(c)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
