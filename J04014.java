import java.util.Scanner;

class PhanSo{
    private Long TuSo;
    private Long MauSo;
    public PhanSo(Long Tu,Long Mau){
        this.TuSo = Tu;
        this.MauSo = Mau;
    }
    public Long gcd(Long a,Long b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    public void RutGon(){
        Long Chung = gcd(this.TuSo,this.MauSo);
        this.TuSo /= Chung;
        this.MauSo /= Chung;
    }
    public PhanSo Cong(PhanSo other){
        PhanSo x = new PhanSo(0L, 0L);
        x.MauSo = this.MauSo*other.MauSo;
        x.TuSo = this.TuSo*other.MauSo + other.TuSo*this.MauSo;
        x.RutGon();
        return x;
    }
    public PhanSo Nhan(PhanSo other){
        PhanSo x = new PhanSo(1L, 1L);
        x.TuSo = this.TuSo*other.TuSo;
        x.MauSo = this.MauSo*other.MauSo;
        x.RutGon();
        return x;
    }
    @Override
    public String toString(){
        return String.format("%d/%d",this.TuSo,this.MauSo);
    }
}
public class J04014 {
    public static void main(String [] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        while(t-- > 0){
            PhanSo A = new PhanSo(r.nextLong(),r.nextLong());
            PhanSo B = new PhanSo(r.nextLong(), r.nextLong());
            PhanSo C = (A.Cong(B)).Nhan(A.Cong(B));
            PhanSo D = A.Nhan(B).Nhan(C);
            System.out.printf("%s %s\n",C.toString(),D.toString());
        }
    }
}
