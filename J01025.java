import java.util.*;
public class J01025 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int x_trai = 1001;
        int x_phai = -1001;
        int y_tren = -1001;
        int y_duoi = 1001;
        int a[] = new int[8];
        for(int i = 0 ; i<8 ; i++) a[i] = r.nextInt();
        for(int i = 0; i < 8 ; i += 2){
            x_phai = Math.max(x_phai,a[i]);
            x_trai = Math.min(x_trai,a[i]);
        }
        for(int i = 1; i< 8 ; i+= 2){
            y_tren = Math.max(y_tren,a[i]);
            y_duoi = Math.min(y_duoi,a[i]);
        }
        int d = Math.abs(y_tren - y_duoi);
        int w = Math.abs(x_trai - x_phai);
        int canh = Math.max(d,w);
        System.out.print(canh*canh);
    }
}
