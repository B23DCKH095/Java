import java.util.*;

public class J02006 {
    public static void main(String[] args){
    Scanner r =new Scanner(System.in);
    int n = r.nextInt();
    int m = r.nextInt();
    boolean x[] = new boolean[1001];
    for(int id = 0 ;id < n+m ; id++){
        int a = r.nextInt();
        x[a] = true;
    }
    for(int i = 0 ; i<1001 ; i++){
        if(x[i]) System.out.printf("%d ",i);
        }
    }
}
