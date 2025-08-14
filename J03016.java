import java.math.BigInteger;
import java.util.*;

public class J03016 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        BigInteger x = new BigInteger("0");
        BigInteger div = new BigInteger("11");
        while(t > 0){
            t--;
            BigInteger a= new BigInteger(r.next());
            boolean ok = false;
            if((a.mod(div)).equals(x)) ok = true;
            if(ok) System.out.println("1");
            else System.out.println("0");
        }
    }    
}
