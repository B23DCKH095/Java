import java.util.*;

public class J02037 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        while(t>0){
            t--;
            String s = r.nextLine().trim();
            String words[] = s.split("\\s+");
            int le = 0;
            int chan = 0;
            for(int i = 0 ; i < words.length ; i++){
                String cur  =words[i];
                int x = cur.charAt(cur.length()-1) - '0';
                if(x%2==0) chan ++;
                else le++;
            }
            boolean ok = false;
            if(words.length%2 == 0 && chan > le) ok = true;
            if(words.length%2 == 1 && le > chan) ok = true;
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }    
}
