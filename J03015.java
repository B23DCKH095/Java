import java.math.BigInteger;
import java.util.Scanner;
public class J03015 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        BigInteger a = new BigInteger(r.next());
        BigInteger b = new BigInteger(r.next());
        System.out.println(a.subtract(b));
    }
}
