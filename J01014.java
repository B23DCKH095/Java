import java.util.*;

public class J01014 {
    public static long calc(long n) {
        long maxPrime = -1;
        
        // Handle even numbers first
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }
        
        // Now check odd numbers up to sqrt(n)
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
            // Early exit if n becomes 1
            if (n == 1) break;
        }
        
        // If remaining n is a prime > 2
        if (n > 2) {
            maxPrime = n;
        }
        
        return maxPrime;
    }

    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t > 0){
            t--;
            long a = r.nextLong();
            System.out.printf("%d\n",calc(a));
        }
    }
}
