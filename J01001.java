import java.util.Scanner;

public class J01001 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        if(a <= 0 || b <=0){
            reader.close();
            System.out.print(0);
            return;
        }
        String ans = String.format("%d %d",2*(a+b),a*b);
        System.out.print(ans);
        reader.close();
    }
}
