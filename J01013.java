import java.util.*;


public class J01013 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        long s = 0;
        int t = r.nextInt();
        while(t>0){
            t--;
            int n = r.nextInt();
            for(int i = 2; i*i <= n ; i++){
                if(n%i == 0){
                    while(n%i == 0){
                        s += i;
                        n/= i;
                    }
                }
            }
            if(n >1) s += n;
        }
        System.out.printf("%d",s);
    }    
}
