import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

class xang{
    public String ma;
    public String hang;
    public Long dongia;
    public Long thue;
    public Long thanhtien;
    public xang(String ma,Long soluong){
        this.ma = ma;
        String a = ma.substring(0,1);
        Double phantram =  0.0;
        if(a.equals("X")){
            this.dongia = 128000L;
            phantram = 0.03;
        } else if(a.equals("D")){
            this.dongia = 11200L;
            phantram = 0.035;
        }
        else {
            this.dongia = 9700L;
            phantram = 0.02;
        }
        //tinh tien;
        String b = ma.substring(ma.length()-2);
        if(b.equals("BP")) this.hang = "British Petro";
        else if(b.equals("ES")) this.hang = "Esso";
        else if(b.equals("SH")) this.hang = "Shell";
        else if(b.equals("CA")) this.hang = "Castrol";
        else if(b.equals("MO")) this.hang = "Mobil";
        else {
            this.hang = "Trong Nuoc";
            phantram = 0.0;
        }
        Long tien = soluong*this.dongia;
        this.thue = Math.round(tien*phantram);
        this.thanhtien = tien + this.thue;
    }
    public String toString(){
        return String.format("%s %s %d %d %d",this.ma,this.hang,this.dongia,this.thue,this.thanhtien);
    }
}
public class J05067 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        ArrayList<xang> ds =  new ArrayList<>();
        while(t-- > 0){
            ds.add(new xang(r.next(),r.nextLong()));
        }
        for(xang tmp : ds){
            System.out.println(tmp);
        }
    }
}
