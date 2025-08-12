import java.util.*;

public class J02101 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t =r.nextInt();
        while(t > 0){
            t -= 1;
            int n =r.nextInt();
            for(int i = 0; i <n ; i++){
                int a[] = new int[n];
                for(int j = 0 ;j < n ; j++) a[j] = r.nextInt();
                if(i%2 == 0){
                    for(int j = 0; j < n ;j++) System.out.printf("%d ",a[j]);
                }
                else{
                    for(int j = n-1 ;j >= 0; j --) System.out.printf("%d ",a[j]);
                }
            }
            System.out.println("");
        }
    }    
}
