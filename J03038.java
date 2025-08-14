import java.util.*;

public class J03038 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        String s = r.next();
        boolean x[] = new boolean[30];
        int cnt = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int h = s.charAt(i) - 'a';
            if(!x[h]){
                cnt += 1;
                x[h] = true;
            }
        }
        System.out.print(cnt);
    }    
}
