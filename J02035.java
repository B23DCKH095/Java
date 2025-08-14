import java.util.*;

public class J02035 {
    public static void main(String[] args){
        Scanner r=  new Scanner(System.in);
        int t = r.nextInt();
        while(t > 0){
            t--;
            int n = r.nextInt();
            long a[] = new long[n];
            for(int i = 0 ; i <n ; i ++) a[i] = r.nextLong();
            int ix = -1 ;
            long cur = 1000000000000000000L;
            for(int i = 0 ;i < n ; i++){
                if(a[i] < cur){
                    cur = a[i];
                    ix  = i;
                }
            }
            System.out.printf("%d\n",ix);
    }
    }
}
