import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

public class J07003 {
    public static void main(String[] args){
        File v = new File("DATA.in");
        try{
            Scanner r = new Scanner(v);
            BigInteger x = new BigInteger("9");
            BigInteger u = new BigInteger(r.next());
            while(u.compareTo(x) == 1){
            String l = u.toString();
            BigInteger a = new BigInteger(l.substring(0, l.length()/2));
            BigInteger b = new BigInteger(l.substring(l.length()/2, l.length()));
            // System.out.println(a);
            // System.out.println(b);
            u = a.add(b);
            System.out.println(u);
            }
        } catch (FileNotFoundException e){

            }
        }
    }