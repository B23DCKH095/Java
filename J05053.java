import java.util.*;

class SP implements Comparable<SP>{
    private  String TenSP;
    private int id;
    private String MaSP;
    private String STT;
    private Long GiamGia;
    private Long ThanhTien;
    public SP(String Ten,String Ma,String SDonGia,String SSoLuong){
        Long DonGia = Long.parseLong(SDonGia);
        Long SoLuong = Long.parseLong(SSoLuong);
        this.TenSP = Ten;
        this.id = Integer.parseInt(Ma.substring(Ma.length() - 1));
        this.MaSP = Ma;
        this.STT = Ma.substring(1,4);
        this.GiamGia = TinhGiamGia(this.id, DonGia, SoLuong);
        this.ThanhTien = TinhThanhTien(DonGia, SoLuong, this.GiamGia);
    }
    public Long TinhGiamGia(int id ,Long DonGia,Long SoLuong){
        if(id == 1){
            return Math.round(0.5*DonGia*SoLuong);
        }
        return Math.round(0.3*DonGia*SoLuong);
    }
    public Long TinhThanhTien(Long DonGia , Long SoLuong,Long GiamGia){
        return DonGia*SoLuong - GiamGia;
    }
    public int compareTo(SP other){
        return this.STT.compareTo(other.STT);
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %d %d",this.TenSP,this.MaSP,this.STT,this.GiamGia,this.ThanhTien);
    }
}

public class J05053 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<SP> ds = new ArrayList<>();
        int t =Integer.parseInt(r.nextLine());
        while(t-- > 0){
            ds.add(new SP(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(SP tmp : ds){
            System.out.println(tmp);
        }
    }
}
