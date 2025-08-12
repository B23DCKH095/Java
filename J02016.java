import java.util.*;
public class J02016 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
            int cnt =0;
            int n = r.nextInt();
            for(int i =0 ;i <n ; i++){
                int x = 0;
                for(int j = 0 ;j  < 3 ;j++){
                    int k = r.nextInt();
                    x += k;
                }
                if (x > 1) cnt += 1;
            }
            System.out.printf("%d",cnt);
    }
}
