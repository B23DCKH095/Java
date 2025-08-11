import java.util.Scanner;

public class J01002 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        while(t > 0){
            t--;
            long n = reader.nextLong();
            String ans = String.format("%d\n",(n*(n+1))/2);
            System.out.print(ans);
        }
        reader.close();
    }
}