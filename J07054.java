import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class sv{
    public String ten;
    public String diem;
    public String ma;
    public String xephang;
    public sv(int id,String ten,String d1,String d2,String d3){
        this.ma = String.format("SV%02d", id);
        this.ten = ChuanHoa(ten);
        Double dd1 = Double.parseDouble(d1);
        Double dd2 = Double.parseDouble(d2);
        Double dd3 = Double.parseDouble(d3);
        Double dtb = (dd1*3.0 + dd2*3.0 + dd3*2.0)/ 8.0;
        this.diem = String.format("%.2f",dtb);
    }
    public String ChuanHoa(String ten){
        ten = ten.toLowerCase();

        String[] word = ten.trim().split("\\s+");
        StringBuilder ret = new StringBuilder();
        for(String tmp : word){
            ret.append(tmp.substring(0, 1).toUpperCase());
            ret.append(tmp.substring(1));
            ret.append(" ");
        }
        return ret.toString();
    }
    public void TinhXepHang(int id){
        this.xephang = String.format("%d",id);
    }
    public String toString(){
        return String.format("%s %s%s %s",this.ma ,this.ten,this.diem,this.xephang);
    }
}
public class J07054 {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("BANGDIEM.in");
        Scanner r =new Scanner(x);
        ArrayList<sv> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        int id = 1;
        while(t-- > 0){
            ds.add(new sv(id++,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(sv1,sv2) -> (sv2.diem).compareTo(sv1.diem));
        String cur = "0.00";
        int cnt = 1;
        int hientai = 1;
        for(sv tmp : ds){
            if(cur.equals(tmp.diem)) tmp.TinhXepHang(hientai);
            else{
                hientai = cnt;
                tmp.TinhXepHang(hientai);
                cur = tmp.diem;
            }
            cnt++;
        }
        for(sv tmp :ds){
            System.out.println(tmp);
        }
        Collections.sort(ds,(sv1,sv2) -> (sv1.ma.compareTo(sv2.ma)));
    }   
}
