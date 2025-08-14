import java.util.*;
public class J03007 {
    public static boolean check(String s){
        if(s.charAt(s.length()-1) != '8') return false;
        int t = 0;
        for(int i = 0 ;i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        for(int i = 0 ; i< s.length() ; i++){
            t += s.charAt(i) - '0';
        }
        if(t%10 !=0) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner r =new Scanner(System.in);
        int t = r.nextInt();
        while(t > 0){
            t -= 1;
            String s = r.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
            }
        }
}
