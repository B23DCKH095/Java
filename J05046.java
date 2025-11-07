import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MH{
    public String ma;
    public String ten;
    public Long chietkhau;
    public Long thanhtien;
    public MH(String ten,String soluong,String dongia,Map<String,Integer> mp){
        StringBuilder ret = new StringBuilder();
        String[] word = ten.trim().split("\\s+");
        ret.append(word[0].substring(0,1).toUpperCase());
        ret.append(word[1].substring(0,1).toUpperCase());
        String done = ret.toString();
        if(mp.get(done) == null) mp.put(done,0);
        this.ma = String.format("%s%02d",done,mp.get(done)+1);
        mp.put(done,mp.get(done)+1);
        this.ten = ten;
        Double phantram = 0.0;
        Integer sl = Integer.parseInt(soluong);
        if(sl > 10) phantram = 0.05;
        else if(sl >= 8) phantram = 0.02;
        else if(sl >= 5) phantram = 0.01;
        else phantram = 0.0;
        Integer dg = Integer.parseInt(dongia);
        this.chietkhau = Math.round(dg*sl*phantram);
        this.thanhtien = dg*sl - chietkhau;
    }
    public String toString(){
        return String.format("%s %s %d %d", this.ma,this.ten,this.chietkhau,this.thanhtien);
    }
}

public class J05046 {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<MH> ds = new ArrayList<>();
        Map<String,Integer> mp = new HashMap<>();
        while(t-- > 0){
            ds.add(new MH(r.nextLine(),r.nextLine(),r.nextLine(),mp));
        }
        for(MH tmp: ds)System.out.println(tmp);
    }
}
