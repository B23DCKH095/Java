import java.util.*;

public class J01024 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t > 0){
            t-=1;
            String s = r.next();
            boolean ok = true;
            for(int i = 0; i < s.length() ; i++){
                int x = s.charAt(i) - '0';
                if(!(x >= 0 && x <= 2)) ok = false;
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
