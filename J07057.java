import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class TS implements Comparable<TS>{
    private String MaTS;
    private String TenTS;
    private Double DiemTS;
    private String TrangThai;
    public TS(int id,String ten,String Diem,String dantoc,String khuvuc ){
        this.MaTS=  String.format("TS%02d",id);
        this.TenTS = ChuanHoaTen(ten);
        this.DiemTS = Double.parseDouble(Diem);
        this.DiemTS += TinhDiemCong(dantoc,khuvuc);
        this.TrangThai = TinhTrangThai(this.DiemTS);
    }
    public String ChuanHoaTen(String ten){
        ten = ten.toLowerCase();
        StringBuilder ret = new StringBuilder();
        String[] word =ten.trim().split("\\s+");
        for(String tmp: word){
            ret.append(tmp.substring(0,1).toUpperCase());
            ret.append(tmp.substring(1));
            ret.append(" ");
        }
        return ret.toString();
    }
    public Double TinhDiemCong(String dantoc,String khuvuc){
        Double Tong = 0.0;
        if(dantoc.compareTo("Kinh") != 0) Tong += 1.5;
        Map<String,Double> mp = new HashMap<>();
        mp.put("1", 1.5);
        mp.put("2",1.0);
        mp.put("3",0.0);
        Tong += mp.get(khuvuc);
        return Tong;
    }
    public String TinhTrangThai(Double diem){
        if(diem >= 20.5) return "Do";
        else return "Truot";
    }
    public int compareTo(TS other){
        int ss = Double.compare(other.DiemTS, this.DiemTS);
        if(ss == 0){
            return this.MaTS.compareTo(other.MaTS);
        }
        return ss;
    }
    public String toString(){
        return String.format("%s %s%.1f %s", this.MaTS,this.TenTS,this.DiemTS,this.TrangThai);
    }
}
public class J07057 {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("THISINH.in");
        Scanner r = new Scanner(x);
        ArrayList<TS> ds = new ArrayList<>();
        int id = 1;
        int t= Integer.parseInt(r.nextLine());
        while(t-- >0 ){
            ds.add(new TS(id++,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(TS tmp : ds){
            System.out.println(tmp);
        }
    }
}
