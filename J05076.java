import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class mh{
    public String ma;
    public String ten;
    public String loai;
    public Long TongNhap;
    public Long TongXuat;
    public mh(String a,String b,String c){
        this.ma = a;
        this.ten = b;
        this.loai = c;
    }
    public void calc(String u){
        String []w = u.split(" ");
        Long nhap = Long.parseLong(w[1]);
        Long dongia = Long.parseLong(w[2]);
        Long xuat = Long.parseLong(w[3]);
        this.TongNhap = nhap*dongia;
        Double lai = 0.0;
        if(this.loai.equals("A"))lai = 1.08;
        else if(this.loai.equals("B")) lai = 1.05;
        else lai =  1.02;
        this.TongXuat = Math.round(lai*dongia*xuat);
    }
    public String toString(){
        return String.format("%s %s %d %d",this.ma,this.ten,this.TongNhap,this.TongXuat);
    }
}
public class J05076 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<mh> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            ds.add(new mh(r.nextLine(),r.nextLine(),r.nextLine()));
        }
        t = Integer.parseInt(r.nextLine());
        Map<Integer,String> mp = new HashMap<>();
        int id = 1;
        while(t -- > 0){
            String u = r.nextLine();
            String w = u.split(" ")[0];
            mp.put(id++,u);
        }
        id = 1;
        for(mh tmp : ds){
            tmp.calc(mp.get(id++));
            System.out.println(tmp);
        }
    }
}
