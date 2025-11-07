import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J03020 {
    public static boolean check(String s){
        for(int i = 0 ; i< s.length() /2 ; i++){
            if(s.charAt(i) != s.charAt(s.length()- i -1))return false;
        }
        return true;
    }
    public static void main(String[] args){
        Map<String,Integer> mp = new HashMap<>();
        Map<String,Integer> tt = new HashMap<>();
        Scanner r = new Scanner(System.in);
        int id = 0;
        ArrayList<String> ds = new ArrayList<>();
        while(r.hasNext()){
            String s = r.next();
            if(!mp.containsKey(s)){
                tt.put(s,id);
                mp.put(s,1);
                if(check(s)) ds.add(s);
            }
            else mp.put(s,mp.get(s) + 1);
        }
        Collections.sort(ds ,(s1,s2) ->{
            if(s1.length() == s2.length()){
                return Integer.compare(tt.get(s1),tt.get(s2));
            }
            return Integer.compare(s2.length(),s1.length());
        });
        int mx = ds.get(0).length();
        for(String s : ds){
            if(mx == s.length()) System.out.printf("%s %d\n",s,mp.get(s));
            else break;
        }
    }
}
