import java.util.Scanner;

public class J01009 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        long n = reader.nextInt();
        long s = 1;
        long ans = 0L;
        for(int i = 1; i <= n ; i++){
            s *= i;
            ans += s;
        }
        reader.close();
        System.out.printf("%ld",ans);
    }
}