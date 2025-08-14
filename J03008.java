import java.util.*;

public class J03008 {
    public static boolean check(String s){
        int n = s.length();
        for(int i = 0 ; i< n/2; i ++){
            if(s.charAt(i) != s.charAt(n-i-1)) return false; 
        }
        for(int i = 0 ; i<n ; i++){
            int x = s.charAt(i)-'0';
            if(!(x==2 || x == 3 || x == 5 || x == 7)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner r =new Scanner(System.in);
        int t =r.nextInt();
        while(t > 0){
            t-= 1;
            String s = r.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
