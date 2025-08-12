import java.util.*;

public class J02004 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t > 0){
            t -= 1;
            int n = r.nextInt();
            int a[] = new int [n];
            for(int i = 0 ; i <n ; i++) a[i] = r.nextInt();
            boolean ok = true;
            for(int i = 0 ;i < n/2;i++){
                if(a[i] != a[n-1-i]) ok = false;
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }   
}
