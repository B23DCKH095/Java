import java.math.BigInteger;
import java.util.*;

public class J03012 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t>0){
            t--;
            BigInteger a = new BigInteger(r.next());
            BigInteger b = new BigInteger(r.next());
            System.out.println(a.add(b));
        }
    }
}
