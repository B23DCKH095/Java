import java.util.*;

class HS implements Comparable<HS> {
    private String MaHS;
    private String TenHS;
    private Double DiemTB;
    private String XepHangHS;
    public HS(int id,String Ten,String Diem){
        this.MaHS = String.format("HS%02d",id);
        this.TenHS = Ten;
        this.DiemTB = TinhDiemTB(Diem);
        this.XepHangHS = TinhXepHang(this.DiemTB);
    }
    public Double TinhDiemTB(String Diem){
        Double ret = 0.0;
        String words[] = Diem.trim().split("\\s+");
        for(String tmp : words){
            ret += Double.parseDouble(tmp);
        }
        ret += Double.parseDouble(words[0]);
        ret += Double.parseDouble(words[1]);
        return Math.round(ret*10.0/12.0)/10.0;
    }
    public String TinhXepHang(Double DiemTB){
        if(DiemTB >= 9) return "XUAT SAC";
        else if(DiemTB >= 8) return "GIOI";
        else if(DiemTB >= 7) return "KHA";
        else if(DiemTB >= 5) return "TB";
        else return "YEU";
    }
    public int compareTo(HS other){
        if(this.DiemTB == other.DiemTB) return this.MaHS.compareTo(other.MaHS);
        return  Double.compare(other.DiemTB, this.DiemTB);
    }
    @Override
    public String toString(){
        return String.format("%s %s %.1f %s", this.MaHS,this.TenHS,this.DiemTB,this.XepHangHS);
    }
}
public class J05018 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<HS> ds =  new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        int id = 1;
        while(t-- > 0){
            ds.add(new HS(id++,r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(HS tmp : ds){
            System.out.println(tmp);
        }
    }
}
