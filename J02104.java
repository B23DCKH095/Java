import java.util.Scanner;

public class J02104 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int n =r.nextInt();
        for(int i = 1; i<= n ;i++){
            for(int j =1 ;j <= n ;j++){
                int x = r.nextInt();
                if(j > i && x == 1) System.out.printf("(%d,%d)\n",i,j);
            }
        }
        r.close();
    }    
}