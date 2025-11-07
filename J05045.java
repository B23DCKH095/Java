import java.util.*;

class NV implements Comparable<NV>{
    private String MaNV;
    private String HoTen;
    private Long PhuCapChucVu;
    private Long LuongChinh;
    private Long TamUng;
    private Long ConLai;
    public NV(int id,String ten,String ChucVu,String LuongCoBan,String SoNgayCong){
        this.MaNV = String.format("NV%02d",id);
        this.HoTen = ten;
        this.PhuCapChucVu = TinhPhuCap(ChucVu);
        this.LuongChinh = Long.parseLong(SoNgayCong)*Long.parseLong(LuongCoBan);
        this.TamUng = TinhTamUng(this.PhuCapChucVu, this.LuongChinh);
        this.ConLai = this.LuongChinh + this.PhuCapChucVu - this.TamUng;
    }
    public Long TinhPhuCap(String ChucVu){
        Map<String,Long> mp = new HashMap<>();
        mp.put("GD", 500L);
        mp.put("PGD",400L);
        mp.put("TP",300L);
        mp.put("KT",250L);
        if(mp.get(ChucVu) == null) return 100L;
        else return mp.get(ChucVu);
    }
    public Long TinhTamUng(Long PhuCapChucVu,Long LuongChinh){
        Long Luong = LuongChinh;
        if( (Luong + PhuCapChucVu)*(2.0/3.0)  < 25000L){
            return Math.round(((Luong + PhuCapChucVu)*(2.0/3.0))/1000.0)*1000;
        }
        return 25000L;
    }
    public int compareTo(NV other){
        int ss = Long.compare(other.ConLai,this.ConLai);
        if(ss == 0) return this.MaNV.compareTo(other.MaNV);
        return ss;
    }
    public String toString(){
        return String.format("%s %s %d %d %d %d",this.MaNV,this.HoTen,this.PhuCapChucVu,this.LuongChinh,this.TamUng,this.ConLai);
    }

}
public class J05045 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int id = 1;
        int t = Integer.parseInt(r.nextLine());
        ArrayList<NV> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new NV(id ++ ,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(NV tmp : ds){
            System.out.println(tmp);
        }
    }
}
