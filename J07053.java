import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class PH{
    private String ma;
    private String ten;
    private int tuoi;
    private Long diem;
    private String xeploai;
    public PH(int id,String a,String b,String c,String d){
        this.ma = String.format("PH%02d",id);
        this.ten = ChuanHoa(a);
        this.tuoi = TinhTuoi(b);
        this.diem = TinhDiem(c,d);
        this.xeploai = TinhXepLoai(this.diem);
    }
    public String ChuanHoa(String ten){
        StringBuilder ret = new StringBuilder();
        String[] word = ten.toLowerCase().trim().split("\\s+");
        for(String tmp : word){
            ret.append(tmp.substring(0,1).toUpperCase());
            ret.append(tmp.substring(1));
            ret.append(" ");
        }
        return ret.toString();
    }
    public int TinhTuoi(String sinh){
        return 2021 - Integer.parseInt(sinh.substring(sinh.length() - 4));
    }
    public Long TinhDiem(String a,String b){
        Double thuong = 0.0;
        Double lt = Double.parseDouble(a);
        Double th = Double.parseDouble(b);
        Double mn = Math.min(lt,th);
        if(mn >= 8) thuong  = 1.0;
        else if(mn >= 7.5) thuong = 0.5;
        Double tb = (lt + th)/2 + thuong;
        Double ret = Math.min(10.0,tb);
        return Math.round(ret);
    }
    public String TinhXepLoai(Long diem){
        if(diem <= 5) return "Truot";
        else if(diem <= 6) return "Trung binh";
        else if(diem <= 7) return "Kha";
        else if(diem <= 8) return "Gioi";
        else return "Xuat sac";
    }
    public String toString(){
        return String.format("%s %s%d %d %s", this.ma ,this.ten,this.tuoi,this.diem,this.xeploai);
    }
}

public class J07053{
    public static void main(String[] args) throws FileNotFoundException{
        // File x = new File("XETTUYEN.in");
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<PH> ds = new ArrayList<>();
        int id = 1;
        while(t-- > 0){
            ds.add(new PH(id++,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        for(PH tmp : ds){
            System.out.println(tmp);
        }

    }
}