import java.util.*;


class SP{
    private String MaLoai;
    private String TenSP;
    private long DonGia1;
    private long DonGia2;
    public SP(String Ma,String Ten,Long gia1,Long gia2){
        this.MaLoai = Ma;
        this.TenSP = Ten;
        this.DonGia1 = gia1;
        this.DonGia2 = gia2;
    }
    public String getTenSP(){
        return TenSP;
    }
    public Long getDonGia1(){
        return this.DonGia1;
    }
    public Long getDonGia2(){
        return this.DonGia2;
    }
}
class HD{
    private String MaHD;
    private String TenSP;
    private long GiamGia;
    private long GiaPhaiTra;
    public HD(String MaGoc,int SoLuong,int stt,Map<String,SP> mp){
        String MaLoai = MaGoc.substring(0,2);
        String Loai = MaGoc.substring(2);
        this.MaHD = String.format("%s-%03d",MaGoc,stt);
        SP sp = mp.get(MaLoai);
        this.TenSP = sp.getTenSP();
        Long DonGia;
        if(Loai.compareTo("1") == 0) DonGia = sp.getDonGia1();
        else DonGia = sp.getDonGia2();
        long thanhTien = DonGia*SoLuong;
        if(SoLuong >= 150){
            this.GiamGia = Math.round(thanhTien*0.5);
        }
        else if(SoLuong >= 100) this.GiamGia = Math.round(thanhTien*0.3);
        else if(SoLuong >= 50) this.GiamGia = Math.round(thanhTien*0.15);
        else this.GiamGia = 0;
        this.GiaPhaiTra = thanhTien - this.GiamGia;
    }
    @Override
    public String toString(){
        return String.format("%s %s %d %d", this.MaHD,this.TenSP,this.GiamGia,this.GiaPhaiTra);
    }

}

public class J06001 {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        int n = Integer.parseInt(r.nextLine());
        Map<String,SP> mp  = new HashMap<>();
        for(int i = 0 ; i< n ;i++){
            String ma =r.nextLine();
            String ten = r.nextLine();
            long gia1= Long.parseLong(r.nextLine());
            long gia2 = Long.parseLong(r.nextLine());
            mp.put(ma,new SP(ma,ten,gia1,gia2));
        }
        int m = Integer.parseInt(r.nextLine());
        ArrayList<HD> ds = new ArrayList<>();
        for(int i = 0 ; i < m ;i++){
            String[] input = r.nextLine().split("\\s+");
            String maGoc = input[0];
            int SoLuong = Integer.parseInt(input[1]);
            ds.add(new HD(maGoc,SoLuong,i+1,mp));
        }
        for(HD hd : ds){
            System.out.println(hd);
        }
    }
}
