import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class NV implements Comparable<NV>{
    private String ma;
    private String ten;
    private Long phucap;
    private Long luongchinh;
    private Long tamung;
    private String chucvu;
    private Long conlai;
    public NV(int id,String ten,String chucvu,String luongcoban,String songaycong){
        this.ma =String.format("NV%02d",id);
        this.ten = ten;
        this.chucvu = chucvu;
        Map<String,Long> mp = new HashMap<>();
        mp.put("GD",500L);
        mp.put("PGD",400L);
        mp.put("TP",300L);
        mp.put("KT",250L);
        if(mp.get(chucvu) == null) this.phucap = 100L;
        else this.phucap = mp.get(chucvu);
        this.luongchinh = Long.parseLong(songaycong)*Long.parseLong(luongcoban);
        if((this.phucap + this.luongchinh)*(2.0/3.0) < 25000L){
            this.tamung = Math.round(((this.phucap + this.luongchinh)*(2.0/3.0))/1000)*1000;
        } else this.tamung = 25000L;
        this.conlai = this.luongchinh + this.phucap - this.tamung;
    }
    public Long getThuNhap(){
        return this.conlai;
    }
    public int compareTo(NV other){
        int ss = Long.compare(other.conlai,this.conlai);
        if(ss == 0) return this.ma.compareTo(other.ma);
        return ss;
    }
    public String toString(){
        return String.format("%s %s %d %d %d %d",this.ma,this.ten,this.phucap,this.luongchinh,this.tamung,this.conlai);
    }
}
public class J05044 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<NV> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        int id = 1;
        while(t-- > 0){
            ds.add(new NV(id++,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(NV tmp : ds) System.out.println(tmp);
        }
    }
