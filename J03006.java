import java.util.*;
public class J03006 {
    public static boolean check(String n){
        for(int i = 0 ; i < n.length()/2; i++){
            if(n.charAt(i) != n.charAt(n.length()-1-i)) return false;
        }
        for(int i = 0 ;i < n.length() ; i++){
            int x = n.charAt(i)-'0';
            if(x%2==1) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t =r.nextInt();
        while( t > 0){
            t -= 1;
            String n = r.next();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
