import java.util.Scanner;

public class J03040 {
    public static boolean check(String s) {
        if (s.length() < 13) return false;
        
        try {
            int a = s.charAt(7) - '0';  
            int b = s.charAt(8) - '0';
            int c = s.charAt(9) - '0';
            int d = s.charAt(11) - '0';
            int e = s.charAt(12) - '0';
            
            boolean allEqual = (a == b && b == c && c == d && d == e);
            boolean firstThreeAndLastTwoEqual = (a == b && b == c && d == e);
            boolean increasing = (a < b && b < c && c < d && d < e);
            boolean allSixOrEight = ((a == 6 || a == 8) && (b == 6 || b == 8) && 
                                   (c == 6 || c == 8) && (d == 6 || d == 8) && 
                                   (e == 6 || e == 8));
            
            return allEqual || firstThreeAndLastTwoEqual || increasing || allSixOrEight;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); 
        while (t-- > 0) {
            String s = sc.nextLine().trim();  
            System.out.println(check(s) ? "YES" : "NO");
        }
        sc.close();
    }
}g