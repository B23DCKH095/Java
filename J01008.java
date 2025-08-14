import java.util.*;

public class J01008 {
    public static void calc(int n){
        for(int i = 2; i*i <= n; i++){
            if(n%i ==0){
                int cnt =0;
                while(n%i==0){
                    ++ cnt;
                    n /=i;
                }
                System.out.printf("%d(%d) ",i,cnt);
            }
        }
        if(n > 1) System.out.printf("%d(%d) ",n,1);
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        for(int test = 1 ;test <= t; test ++ ){
            System.out.printf("Test %d: ",test);
            int x = r.nextInt();
            calc(x);
            System.out.println("");
        }
    }
}
