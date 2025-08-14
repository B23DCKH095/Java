import java.util.*;

public class J03032 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine()); 
        
        while (t-- > 0) {
            String line = r.nextLine();
            String[] words = line.split(" ");
            
            for (int i = 0; i < words.length; i++) {
                String rev = new StringBuilder(words[i]).reverse().toString();
                System.out.print(rev);
                if (i < words.length - 1) {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
    }
}