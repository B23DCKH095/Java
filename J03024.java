import java.util.*;

public class J03024 {
    public static int check(String s){
        int chan = 0;
        int le = 0;
        int n = s.length();
        for(int i = 0 ;i <n ; i++){
            int x = s.charAt(i) - '0';
            if(!(x >= 0 && x <= 9)) return 0;
            if(x%2 == 1) le++;
            else chan ++;
        }
        if(chan > le && n%2 == 0) return 1;
        if(le > chan && n%2 == 1) return 1;
        return 2;
    }
    public static void main(String[] args){
        Scanner r =new Scanner(System.in);
        int t = r.nextInt();
        while(t > 0){
            t --;
            String s = r.next();
            int ans = check(s);
            if(ans == 0) System.out.println("INVALID");
            if(ans == 1) System.out.println("YES");
            if(ans == 2) System.out.println("NO"); 
        }
    }
}
