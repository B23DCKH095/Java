import java.util.Scanner;

public class J02105 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        for(int i = 1; i <= n ; i++){
            System.out.printf("List(%d) = ",i);
            for(int j = 1; j <= n ; j++){
                int x = r.nextInt();
                if(x==1) System.out.printf("%d ",j);
            }
            System.out.println("");
        }
        r.close();
    }
}
