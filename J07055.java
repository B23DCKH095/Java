import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SV implements Comparable<SV>{
    private String MaSV;
    private String TenSV;
    private double DiemTongKet;
    private String XepLoai;
    public SV(int id,String Ten, String diem1,String diem2,String diem3){
        this.MaSV = String.format("SV%02d", id);
        this.TenSV = FormatName(Ten);
        this.DiemTongKet = TinhDiemTongKet(diem1, diem2, diem3);
        this.XepLoai = TinhXepLoai(this.DiemTongKet);
    }
    public Double TinhDiemTongKet(String diem1,String diem2,String diem3){
        Double DiemTong = Double.parseDouble(diem1)*0.25;
        DiemTong += Double.parseDouble(diem2)* 0.35;
        DiemTong += Double.parseDouble(diem3)*0.4;
        return DiemTong;
    }
    public String FormatName(String Ten){
        Ten = Ten.toLowerCase().trim();
        String word[] = Ten.split("\\s+");
        StringBuilder ret = new StringBuilder();
        for(String tmp : word){
            String name = new String();
            name += tmp.substring(0,1).toUpperCase();
            name += tmp.substring(1);
            ret.append(name);
            ret.append(" ");
        }
        return ret.toString();
    }
    public String TinhXepLoai(Double DiemTongKet){
        if(DiemTongKet >= 8) return "GIOI";
        else if(DiemTongKet >= 6.5) return "KHA";
        else if(DiemTongKet >= 5) return "TRUNG BINH";
        else return "KEM";
    }
    public int compareTo(SV other){
        return Double.compare(other.DiemTongKet, this.DiemTongKet);
    }
    @Override
    public String toString(){
        return String.format("%s %s%.2f %s",this.MaSV,this.TenSV,this.DiemTongKet,this.XepLoai);
    }

}

public class J07055 {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("BANGDIEM.in");
        Scanner r = new Scanner(x);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<SV> ds  = new ArrayList<>();
        int id = 1;
        while(t-- > 0){
            ds.add(new SV(id ++ ,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(SV tmp : ds){
            System.out.println(tmp);
        }
    }
}
