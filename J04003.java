import java.io.Reader;
import java.util.*;

class phanso {
    private long tu;
    private long mau;
    public phanso(long tu,long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public long gcd(long a,long b){
        if(b!= 0) return gcd(b,a%b);
        return a;
    }
    public void rutgon(){
        long x = gcd(this.tu , this.mau);
        this.tu /= x;
        this.mau/= x;
    }
    public void display(){
        System.out.printf("%d/%d",this.tu , this.mau);
    }
    
}

public class J04003 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        phanso a = new phanso(r.nextLong(),r.nextLong());
        a.rutgon();
        a.display();
    }
}
