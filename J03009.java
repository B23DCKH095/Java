import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        while (t-- > 0) {
            String s1 = r.nextLine();
            String s2 = r.nextLine();
            String[] w2 = s2.trim().split("\\s+");
            String[] w1 = s1.trim().split("\\s+");
            Set<String> se2 = new HashSet<>();
            Set<String> se1 = new TreeSet<>();
            for(String u : w2) se2.add(u);
            for(String u : w1){
                if(se2.add(u) == true){
                    se1.add(u);
                }
            }
            for(String u : se1) System.out.printf("%s ",u );
            System.out.println(" ");
        }
    }
}
