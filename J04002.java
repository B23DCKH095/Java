import java.util.*;

public class J04002 {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        String a = r.next();
        String b = r.next();
        String c = r.next().toLowerCase();
        try{
            StringBuilder col = new StringBuilder();
            col.append(Character.toUpperCase(c.charAt(0)));
            col.append(c.substring(1));
            long x = Long.parseLong(a);
            long y = Long.parseLong(b);
            boolean ok = true;
            if(x < 0 || y <0) ok = false;
            if(!ok) System.out.print("INVALID");
            else System.out.printf("%d %d %s",(x+y)*2,x*y,col);
        } catch(NumberFormatException e){
            System.out.print("INVALID");
        }
    }
}
