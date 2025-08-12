import java.util.*;

public class J01017 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        r.nextLine(); // Consume the newline left after nextInt()
        while (t > 0) {
            t -= 1;
            String s = r.nextLine();
            boolean ok = true;
            for (int i = 0; i < s.length() - 1; i++) {
                if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}