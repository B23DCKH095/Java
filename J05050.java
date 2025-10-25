import java.util.*;

class dien{
    public String ma;
    public Long heso;
    public Long thanhtien;
    public Long phutroi;
    public Long tongtien;
    public dien(int id,String loaisd,String chisocu,String chisomoi){
        this.ma = String.format("KH%02d", id);
        if(loaisd.equals("KD")) this.heso = 3L;
        else if(loaisd.equals("NN")) this.heso = 5L;
        else if(loaisd.equals("TT")) this.heso = 4L;
        else this.heso = 2L;
        Long cu = Long.parseLong(chisocu);
        Long moi = Long.parseLong(chisomoi);
        this.thanhtien = (moi - cu)*550*this.heso;
        Long ss = moi - cu;
        if(ss > 100) this.phutroi = Math.round(this.thanhtien*1.0);
        else if(ss >= 50) this.phutroi = Math.round(this.thanhtien*0.35);
        else this.phutroi = 0L;
        this.tongtien = this.phutroi + this.thanhtien;

    }
    public String toString(){
        return String.format("%s %d %d %d %d",this.ma,this.heso,this.thanhtien,this.phutroi,this.tongtien);
    }
}
public class J05050 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<dien> ds = new ArrayList<>();
        int id = 1;
        while(t-- > 0)ds.add(new dien(id++,r.nextLine(),r.nextLine(),r.nextLine()));
        for(dien tmp : ds){
            System.out.println(tmp);
        }
    }
}
