import java.text.ParseException;
import java.util.*;
import java.util.zip.DataFormatException;

public class J04002 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int a,b;
        String c;
        try{
            a = Integer.parseInt(r.next());
            b = Integer.parseInt(r.next());
            c = r.next().toLowerCase();
            StringBuilder col = new StringBuilder();
            col.append(c.substring(0,1).toUpperCase());
            col.append(c.substring(1));
            c = col.toString();
            if(a <= 0 || b <= 0) System.out.println("INVALID");
            else System.out.printf("%d %d %s",(a+b)*2,a*b,c);
        } catch(Exception e){
            System.out.println("INVALID");
        }
    }
}
