import java.util.*;

public class J01010 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while (t > 0) {
            t -= 1;
            boolean ok = true;
            String n = r.next();
            long ans = 0;  // Changed to long to handle larger numbers
            for (int i = 0; i < n.length(); i++) {
                int x = n.charAt(i) - '0';
                if (!(x == 0 || x == 1 || x == 8 || x == 9)) {
                    ok = false;
                    break;  // Exit early if invalid digit found
                }
            }
            
            if (ok) {
                // Re-process to build the number
                ans = 0;
                boolean leadingZero = true;
                for (int i = 0; i < n.length(); i++) {
                    int x = n.charAt(i) - '0';
                    if (x == 1) {
                        ans = ans * 10 + 1;
                        leadingZero = false;
                    } else if (x == 0 || x == 8 || x == 9) {
                        if (!leadingZero) {  // Skip leading zeros
                            ans = ans * 10;
                        }
                    }
                }
            }
            
            if (ok && ans > 0) {
                System.out.println(ans);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}