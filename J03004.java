import java.util.*;

public class J03004 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        while(t > 0){
            t--;
            String s = r.nextLine();
            Scanner u = new Scanner(s);
            while(u.hasNext()){
                String v = u.next();
                v = v.toLowerCase();
                Character tmp = Character.toUpperCase(v.charAt(0));
                v = v.substring(1);
                System.out.printf("%c%s ",tmp,v);
            }
            System.out.println("");
        }
    }    
}
