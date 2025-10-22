import java.util.*;
class SP{
    private String MaSP;
    private String TenSP;
    private String Dvi;
    private Long PhiVanChuyen;
    private Long ThanhTien;
    private Double GiaBan;
    public SP(int id,String TenHang,String Dvi,Long DonGia,Long SoLuong){
        this.MaSP = String.format("MH%02d", id);
        this.TenSP = TenHang;
        this.Dvi = Dvi;
        this.PhiVanChuyen = TinhPhiVanChuyen(DonGia,SoLuong);
        this.ThanhTien = TinhThanhTien(DonGia,SoLuong,this.PhiVanChuyen);
        this.GiaBan = TinhGiaBan(this.ThanhTien);
    }
    public Long TinhPhiVanChuyen(Long DonGia,Long SoLuong){
        return Math.round((DonGia*SoLuong)*0.05);
    }
    public Long TinhThanhTien(Long DonGia,Long SoLuong,Long PhiVanChuyen){
        return DonGia*SoLuong + PhiVanChuyen;
    }
    public Double TinhGiaBan(Long ThanhTien){
        return ThanhTien + 0.02*ThanhTien;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %d %d %.0f",MaSP,TenSP,Dvi,PhiVanChuyen,ThanhTien,GiaBan);
    }

}
public class J05036 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<SP> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        int id = 0;
        while(t-- > 0){
            ds.add( new SP(++id ,r.nextLine(),r.nextLine(),Long.parseLong(r.nextLine()),Long.parseLong(r.nextLine())));
        }
        for(SP tmp : ds){
            System.out.println(tmp);
        }
        r.close();
    }
}
