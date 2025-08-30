import java.util.*;

public class J01025{
    public static void main(String[] args){
        int x_min = 1001;
        int y_min = 1001;
        int x_max = -1001;
        int y_max = -1001;
        Scanner r = new Scanner(System.in);
        for(int i = 0 ; i < 4; i ++){
            int x = r.nextInt();
            int y = r.nextInt();
            x_min = Math.min(x,x_min);
            y_min = Math.min(y,y_min);
            x_max = Math.max(x,x_max);
            y_max = Math.max(y,y_max);
        }
        int w = Math.abs(x_max - x_min);
        int h = Math.abs(y_max-y_min);
        int c = Math.max(w,h);
        System.out.print(c*c);
    }
}