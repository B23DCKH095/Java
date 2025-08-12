import java.util.*;
public class J02034 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i<n ; i++) a[i] = r.nextInt();
        boolean x[] = new boolean[201];
        int mx = 0;
        for(int i = 0 ; i<n ; i++){
            mx = Math.max(mx ,a[i]);
            x[a[i]] = true;
        }
        boolean ok = true;
        for(int i =1; i <= mx ; i++){
            if(!x[i]){
                System.out.printf("%d\n",i);
                ok = false;
            }
        }
        if(ok) System.out.println("Excellent!");
    }
}
