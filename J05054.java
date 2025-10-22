import java.util.*;

class HS {
    private String MaHS;
    private String TenHS;
    private String DiemHS;
    private String XepLoaiHS;
    private int XepHangHS;
    public HS(int id ,String Ten ,String Diem){
        this.MaHS = String.format("HS%02d", id);
        this.TenHS = Ten;
        this.DiemHS  =Diem;
        this.XepLoaiHS = TinhXepLoai(Diem);
    }
    public String TinhXepLoai(String DiemHS){
        Double Diem  = Double.parseDouble(DiemHS);
        if(Diem < 5) return "Yeu";
        else if(Diem < 7) return "Trung Binh";
        else if(Diem < 9) return "Kha";
        else return "Gioi";
    }
    public void TinhXepHang(int XepHang){
        this.XepHangHS = XepHang;
    }
    public Double getDiem(){
        return Double.parseDouble(DiemHS);
    }
    public String getMaHS(){
        return this.MaHS;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s %d",this.MaHS,this.TenHS,this.DiemHS,this.XepLoaiHS,this.XepHangHS);
    }
}
public class J05054{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<HS> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        int id = 1;
        while(t-- > 0){
            ds.add(new HS(id++,r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(hs1,hs2) -> Double.compare(hs2.getDiem(),hs1.getDiem()));
        int cnt = 1;
        int XepHang = 1;
        Double DiemHienTai = 10.8;
        for(HS tmp : ds){
            if(tmp.getDiem() < DiemHienTai){
                XepHang = cnt;
                DiemHienTai = tmp.getDiem();
            }
            tmp.TinhXepHang(XepHang);
            cnt ++;
        }
        Collections.sort(ds ,(hs1,hs2) -> (hs1.getMaHS()).compareTo(hs2.getMaHS()));
        for(HS tmp : ds){
            System.out.println(tmp);
        }
    }
}