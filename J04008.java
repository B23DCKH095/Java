import java.util.*;

class point {
    private double a;
    private double b;
    public point(double a ,double b){
        this.a = a;
        this.b = b;
    }
    public double distance(point b){
        double res = 0;
        res += (this.a - b.a)*(this.a - b.a);
        res += (this.b - b.b)*(this.b - b.b);
        return Math.sqrt(res);
    }
}
public class J04008{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t > 0){
            t-= 1;
            point a = new point(r.nextDouble(),r.nextDouble());
            point b = new point(r.nextDouble(),r.nextDouble());
            point c = new point(r.nextDouble(), r.nextDouble());
            boolean ok = true;
            double AB = a.distance(b);
            double BC = b.distance(c);
            double CA = c.distance(a);
            if(AB + BC <= CA) ok = false;
            if(AB + CA <= BC) ok = false;
            if(BC + CA <= AB) ok = false;
            if(ok) System.out.printf("%.3f\n",AB+CA+BC);
            else System.out.println("INVALID");
        }
    }
}