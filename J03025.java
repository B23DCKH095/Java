import java.util.*;

public class J03025 {
    public static boolean check(String s){
        int cnt = 0;
        for(int i = 0 ; i< s.length()/2 ; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) cnt += 1;
        }
        return (cnt == 1 || cnt == 0 && s.length()%2 == 1);
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t =r.nextInt();
        while(t >0){
            t-= 1;
            String s = r.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
