import java.util.*;

public class J04012 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
            String ten = r.nextLine();
            Long LuongCoBan = Long.parseLong(r.nextLine());
            Long SoNgayCong = Long.parseLong(r.nextLine());
            Long LuongThang = LuongCoBan * SoNgayCong;
            String ChucVu = r.nextLine();
            Map<String,Long> mp = new HashMap<>();
            mp.put("GD", 250000L);
            mp.put("PGD",200000L);
            mp.put("TP",180000L);
            mp.put("NV",150000L);
            Long PhuCap = mp.get(ChucVu);
            Long Thuong = 0L;
            if(SoNgayCong >=25) Thuong = Math.round(0.2*LuongThang);
            else if(SoNgayCong >= 22) Thuong = Math.round(0.1*LuongThang);
            Long ThuNhap = LuongThang + Thuong + PhuCap;
            System.out.printf("NV01 %s %d %d %d %d",ten,LuongThang,Thuong,PhuCap,ThuNhap);
    }
}
