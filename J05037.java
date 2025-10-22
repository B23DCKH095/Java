import java.util.*;
class SP implements Comparable<SP>{
    private String MaSP;
    private String TenSP;
    private String Dvi;
    private Long PhiVanChuyen;
    private Long ThanhTien;
    private Long GiaBan;
    public SP(int id,String TenHang,String Dvi,Double DonGia,Double SoLuong){
        this.MaSP = String.format("MH%02d", id);
        this.TenSP = TenHang;
        this.Dvi = Dvi;
        this.PhiVanChuyen = TinhPhiVanChuyen(DonGia,SoLuong);
        this.ThanhTien = TinhThanhTien(DonGia,SoLuong,this.PhiVanChuyen);
        this.GiaBan = TinhGiaBan(this.ThanhTien,SoLuong);
    }
    public Long TinhPhiVanChuyen(Double DonGia,Double SoLuong){
        return Math.round((DonGia*SoLuong)*0.05);
    }
    public Double TinhThanhTien(Double DonGia,Double SoLuong,Double PhiVanChuyen){
        return DonGia*SoLuong + PhiVanChuyen;
    }
    public Double TinhGiaBan(Double ThanhTien,Double SoLuong){

        return Double.parseDouble(Double.toString(ret*100));
    }
    public int compareTo(SP other){
        return Double.compare(other.GiaBan, this.GiaBan);
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %d %d %.0f",MaSP,TenSP,Dvi,PhiVanChuyen,ThanhTien,GiaBan);
    }

}
public class J05037 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<SP> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        int id = 0;
        while(t-- > 0){
            ds.add( new SP(++id ,r.nextLine(),r.nextLine(),Double.parseDouble(r.nextLine()),Double.parseDouble(r.nextLine())));
        }
        Collections.sort(ds);
        for(SP tmp : ds){
            System.out.println(tmp);
        }
        r.close();
    }
}
