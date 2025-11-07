import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class MH {
    public String mahang;
    public Long soluongnhap;
    public Long soluongxuat;
    public Long dongia;
    public Long tien;
    public Long thue;

    public MH(String mahang, String soluongnhap) {
        this.mahang = mahang;
        this.soluongnhap = Long.parseLong(soluongnhap);
        String a = mahang.substring(0, 1);
        if (a.equals("A"))
            this.soluongxuat = Math.round(this.soluongnhap * 0.6);
        else
            this.soluongxuat = Math.round(this.soluongnhap * 0.7);
        String b = mahang.substring(mahang.length() - 1);
        if (b.equals("Y"))
            this.dongia = 110000L;
        else
            this.dongia = 135000L;
        this.tien = this.soluongxuat * this.dongia;
        if (a.equals("A")) {
            if (b.equals("Y"))
                this.thue = Math.round(this.tien * 0.08);
            else
                this.thue = Math.round(this.tien * 0.11);
        } else {
            if (b.equals("Y"))
                this.thue = Math.round(this.tien * 0.17);
            else
                this.thue = Math.round(this.tien * 0.22);
        }
    }

    public String toString() {
        return String.format("%s %d %d %d %d %d", this.mahang, this.soluongnhap, this.soluongxuat, this.dongia,
                this.tien, this.thue);
    }
}

public class J05048 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        ArrayList<MH> ds = new ArrayList<>();
        Integer t = Integer.parseInt(r.nextLine());
        while (t-- > 0) {
            ds.add(new MH(r.nextLine(), r.nextLine()));
        }
        for (MH tmp : ds)
            System.out.println(tmp);
    }
}