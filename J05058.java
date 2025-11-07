import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SV implements Comparable<SV>{
    public String ma;
    public String ten;
    public String uutien;
    public String tongdiem;
    public String trangthai;

    public SV(String ma, String ten, String s1, String s2, String s3) {
        this.ma = ma;
        this.ten = ten;
        String kv = ma.substring(2, 3);
        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);
        Double d3 = Double.parseDouble(s3);
        Double ut = 0.0;
        if (kv.equals("1"))
            ut = 0.5;
        else if (kv.equals("2"))
            ut = 1.0;
        else
            ut = 2.5;
        if (ut % 1 == 0) {
            this.uutien = String.format("%.0f", ut);
        } else {
            this.uutien = String.format("%.1f", ut);
        }
        Double tong = d1 + d1 + d2 + d3 + ut;

        if (tong % 1 == 0) {
            this.tongdiem = String.format("%.0f", tong);
        } else
            this.tongdiem = String.format("%.1f", tong);
        if (tong < 24)
            this.trangthai = "TRUOT";
        else
            this.trangthai = "TRUNG TUYEN";
    }
    public int compareTo(SV other){
        int ss = other.tongdiem.compareTo(this.tongdiem);
        if(ss == 0) return this.ma.compareTo(other.ma);
        return ss;
    }
    public String toString() {
        return String.format("%s %s %s %s %s", this.ma, this.ten, this.uutien, this.tongdiem, this.trangthai);
    }
}

public class J05058 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        ArrayList<SV> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        while (t-- > 0) {
            ds.add(new SV(r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
        }
        Collections.sort(ds, (sv1, sv2) -> sv2.tongdiem.compareTo(sv1.tongdiem));
        for (SV tmp : ds) {
            System.out.println(tmp);
        }
    }
}
