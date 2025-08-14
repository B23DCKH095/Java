import java.util.*;

class point{
    private double x;
    private double y;
    public point(double a,double b){
        this.x  = a;
        this.y  = b;
    }
    public double kc(point b){
        double tmp = (this.x - b.x)*(this.x - b.x) + (this.y - b.y)*(this.y - b.y);
        return Math.sqrt(tmp);
    }
}
public class J04001{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t>0){
            t--;
            point x = new point(r.nextDouble(),r.nextDouble());
            point y = new point(r.nextDouble(),r.nextDouble());
            System.out.printf("%.4f\n",x.kc(y));
        }
    }
}