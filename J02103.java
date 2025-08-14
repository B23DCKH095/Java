import java.util.*;

public class J02103{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        for(int test = 1; test <= t ; test ++){
            System.out.printf("Test %d:\n",test);
            int n = r.nextInt();
            int m = r.nextInt();
            int a[][] = new int[n][m];
            for(int i = 0; i < n ; i ++){
                for(int j = 0 ; j < m ;j ++) a[i][j] = r.nextInt();
            }
            int b[][] = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n ; j++) b[i][j] = a[j][i];
            }
            for(int i = 0 ;i < n ; i++){
                for(int j = 0; j < n ; j++){
                    long res = 0;
                    for(int k = 0; k < m ; k++) res += a[i][k]*b[k][j];
                    System.out.printf("%d ",res);
                }
                System.out.println("");
            }
        }
    }
}