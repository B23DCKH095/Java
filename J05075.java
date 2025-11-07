import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SV {
    public String ma;
    public String ten;
    public String lop;
    public String trangthai;

    public SV(String a, String b, String c) {
        this.ma = a;
        this.ten = b;
        this.lop = c;
    }

    public boolean cmp(String lop) {
        return this.lop.compareTo(lop) == 0;
    }

    public void setTrangThai(String dd) {
        int vang = 0;
        int muon = 0;
        for (int i = 0; i < dd.length(); i++) {
            if (dd.charAt(i) == 'v')
                vang++;
            if (dd.charAt(i) == 'm')
                muon++;
        }
        int cc = 10;
        cc -= vang * 2;
        cc -= muon;
        cc = Math.max(0, cc);
        if (cc == 0)
            this.trangthai = String.format("%d KDDK", cc);
        else
            this.trangthai = String.format("%d", cc);
    }

    public String toString() {
        return String.format("%s %s %s %s", this.ma, this.ten, this.lop, this.trangthai);
    }
}

public class J05075 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = Integer.parseInt(r.nextLine());
        ArrayList<SV> ds = new ArrayList<>();
        Map<String, String> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String a = r.nextLine();
            ds.add(new SV(a, r.nextLine(), r.nextLine()));
        }
        for (int i = 0; i < n; i++) {
            String tmp = r.nextLine();
            String[] word = tmp.split("\\s+");
            mp.put(word[0], word[1]);
        }
        String lop = r.nextLine();
        for (SV tmp : ds) {
            tmp.setTrangThai(mp.get(tmp.ma));
            if (tmp.cmp(lop))
                System.out.println(tmp);
        }

    }
}
