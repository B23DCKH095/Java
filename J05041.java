import java.util.*;

class NV{
    private String ma;
    private String ten;
    private Long luongthang;
    private Long thuong;
    private Long phucap;
    private long thunhap;
    public NV(int id,String ten,String luongcoban,String songaycong,String chucvu){
        this.ma = String.format("NV%02d",id);
        this.ten = ten;
        this.luongthang = Long.parseLong(luongcoban)*Long.parseLong(songaycong);
        Long nc = Long.parseLong(songaycong);
        if(nc >=25) this.thuong = Math.round(this.luongthang*0.2);
        else if(nc >= 22) this.thuong = Math.round(this.luongthang*0.1);
        else this.thuong = 0L;
        
        Map<String,Long> mp = new HashMap<>();
        mp.put("GD",250000L);
        mp.put("PGD",200000L);
        mp.put("TP",180000L);
        mp.put("NV",150000L);
        this.phucap = mp.get(chucvu);
        this.thunhap = this.luongthang + this.thuong + this.phucap;
    }
    public Long getThuNhap(){
        return this.thunhap;
    }
    public String toString(){
        return String.format("%s %s %d %d %d %d",this.ma,this.ten,this.luongthang,this.thuong,this.phucap,this.thunhap);
    }
}
public class J05041 {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        int id = 1;
        ArrayList<NV> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            ds.add(new NV(id++,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(nv1,nv2) -> Long.compare(nv2.getThuNhap(), nv1.getThuNhap()));
        for(NV tmp : ds){
            System.out.println(tmp);
        }
}
}
