import java.util.*;

public class J03019 {
    public static void main(String[] args){
        Scanner r =new Scanner(System.in);
        String s = r.nextLine();
        StringBuilder st = new StringBuilder();
        char cur = 'a';
        for(int i = s.length() -1 ; i >= 0 ; i--){
            char x = s.charAt(i);
            if(x < cur) continue;
            if(x > cur) cur = x;
            st.append(cur);
        }
        st.reverse();
        System.out.print(st);

    }    
}
