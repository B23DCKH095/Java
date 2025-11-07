import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J03021 {
    public static boolean check(String x){
        int n = x.length();
        for(int i = 0 ; i < x.length()/2; i++){
            if(!x.substring(i,i+1).equals(x.substring(n-i-1,n-i))) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Map<String,String> mp = new HashMap<>();
        mp.put("A","2");
        mp.put("B","2");
        mp.put("C","2");
        mp.put("D","3");
        mp.put("E","3");
        mp.put("F","3");
        mp.put("G","4");
        mp.put("H","4");
        mp.put("I","4");
        mp.put("J","5");
        mp.put("K","5");
        mp.put("L","5");
        mp.put("M","6");
        mp.put("N","6");
        mp.put("O","6");
        mp.put("P","7");
        mp.put("Q","7");
        mp.put("R","7");
        mp.put("S","7");
        mp.put("T","8");
        mp.put("U","8");
        mp.put("V","8");
        mp.put("W","9");
        mp.put("X","9");
        mp.put("Y","9");
        mp.put("Z","9");
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t-- > 0){
            String tar = r.next().toUpperCase();
            StringBuilder ret = new StringBuilder();
            for(int i = 0 ;i < tar.length() ; i++){
                ret.append(mp.get(tar.substring(i,i+1)));
            }

            String u = ret.toString();
            if(check(u)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
