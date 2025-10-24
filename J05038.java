import java.util.*;

class NV{
    private String MaNV;
    private String TenNV;
    private Long LuongThang;
    private Long Thuong;
    private Long PhuCapChucVu;
    private Long ThucLinh;

    public NV(int id,String Ten,String LuongNgay,String SoNgayCong,String ChucVu){
        this.MaNV = String.format("NV%02d",id);
        this.TenNV = Ten;
        this.LuongThang =TinhLuongThang(LuongNgay, SoNgayCong);
        this.Thuong = TinhThuong(SoNgayCong, LuongThang);
        this.PhuCapChucVu = TinhPhuCap(ChucVu);
        this.ThucLinh = this.LuongThang + this.Thuong + this.PhuCapChucVu;
    }
    public Long TinhLuongThang(String LuongNgay ,String SoNgayCong){
        return Long.parseLong(SoNgayCong)*Long.parseLong(LuongNgay);
    }
    public Long TinhThuong(String SoNgayCong ,Long LuongThang){
        Long Days = Long.parseLong(SoNgayCong);
        if(Days >= 25) return Math.round(0.2*LuongThang);
        else if(Days >= 22) return Math.round(0.1*LuongThang);
        else return 0L;
    }
    public Long TinhPhuCap(String ChucVu){
        if(ChucVu.compareTo("GD") == 0) return 250000L;
        else if(ChucVu.compareTo("PGD") ==0) return 200000L;
        else if(ChucVu.compareTo("TP") ==0) return 180000L;
        else return 150000L;
    }
    public Long getLuong(){
        return this.ThucLinh;
    }
    public String toString(){
        return String.format("%s %s %d %d %d %d", this.MaNV,this.TenNV,this.LuongThang,this.Thuong,this.PhuCapChucVu,this.ThucLinh);
    }
}
public class J05038 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int id = 1;
        int t = Integer.parseInt(r.nextLine());
        ArrayList<NV> ds  = new ArrayList<>();
        while(t-- > 0){
            ds.add(new NV(id++, r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Long Luong  = 0L;
        for(NV tmp : ds){
            System.out.println(tmp);
            Luong += tmp.getLuong();
        }
        System.out.printf("Tong chi phi tien luong: %d", Luong);
    }
}
