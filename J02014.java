import java.util.*;

public class J02014 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t>0){
            t--;
            int n = r.nextInt();
            int a[] = new int[n];
            for(int i = 0 ; i <n ; i++) a[i] = r.nextInt();
            int pre[] = new int[n+1];
            int pos[] = new int[n+1];
            for(int i = 1; i <= n ; i++) pre[i] = pre[i-1] + a[i-1];
            for(int i = n-1; i >= 0 ; i--) pos[i] = pos[i+1]+ a[i];
            // for(int i = 0 ; i <= n; i++) System.out.printf("%d ",pre[i]);
            // System.out.println("");
            // for(int i = 0 ; i<= n ;i++) System.out.printf("%d ",pos[i]);
            // System.out.println("");
            int ans = -1;
            for(int i =1; i < n ; i++){
                if(pre[i] == pos[i-1]){
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
    }
    }
}
