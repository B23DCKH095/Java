import java.util.*;

public class J02005 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int m = r.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i = 0 ; i<n ; i++) a[i] = r.nextInt();
        for(int i = 0 ; i< m ; i++) b[i] = r.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean x[] = new boolean[1001];
        boolean c[] = new boolean[1001];
        for(int i = 0; i < n ; i++) x[a[i]] = true;
        for(int i = 0; i < m ; i++){
            if(x[b[i]] && !c[b[i]]) {
                System.out.printf("%d ",b[i]);
                c[b[i]] = true;
            }
        }
    }
}
