import java.util.*;

public class J01018 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t > 0){
            t -= 1;
            String s = r.next();
            boolean ok = true;
            int tong  = 0;
            for(int i = 0 ; i < s.length()-1 ; i++){
                if(Math.abs(s.charAt(i) - s.charAt(i+1)) != 2) ok = false;
                tong += s.charAt(i)- '0';
            }
            tong += s.charAt(s.length()-1)-'0';
            if(ok && tong%10 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
