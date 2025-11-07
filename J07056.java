import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class KH{
    public String ma;
    public String ten;
    public Long vuot;
    public Long trong;
    public Long nop;
    public Long thue;
    public KH(int id,String ten,String Loai){
        this.ma = String.format("KH%02d",id);
        this.ten = chuanhoa(ten);
        String[] word = Loai.trim().split("\\s+");
        Long sodien = Long.parseLong(word[2]) - Long.parseLong(word[1]);
        String loai = word[0];
        Long dinhmuc = 0L;
        if(loai.equals("A")) dinhmuc = 100L;
        else if(loai.equals("B")) dinhmuc = 500L;
        else dinhmuc = 200L;
        if(sodien < dinhmuc){
            this.trong = sodien*450;
            this.vuot = 0L;
        } else {
            this.trong = dinhmuc*450;
            this.vuot = (sodien - dinhmuc)*1000;
        }
        this.thue = Math.round(0.05*this.vuot);
        this.nop = this.vuot + this.trong + this.thue;
    }
    public String chuanhoa(String ten){
        StringBuilder ret = new StringBuilder();
        String[] word = ten.toLowerCase().trim().split("\\s+");
        for(String tmp: word){
            ret.append(tmp.substring(0,1).toUpperCase());
            ret.append(tmp.substring(1));
            ret.append(" ");
        }
        return ret.toString();
    }
    public String toString(){
        return String.format("%s %s%d %d %d %d", this.ma,this.ten,this.trong,this.vuot,this.thue,this.nop);
    }
}
public class J07056 {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("KHACHHANG.in");
        Scanner r = new Scanner(x);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<KH> ds = new ArrayList<>();
        int id = 1;
        while (t-- > 0) {
            ds.add(new KH(id++,r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(kh1,kh2) -> Long.compare(kh2.nop,kh1.nop));
        for(KH tmp : ds){
            System.out.println(tmp);
        }
    }
}
