import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

class sv {
    public String ma;
    public String ten;
    public String lop;

    public sv(String a, String b, String c, String d) {
        this.ma = a;
        this.ten = chuanhoa(b);
        this.lop = c;
    }

    public String chuanhoa(String s) {
        StringBuilder ret = new StringBuilder();
        String[] w = s.trim().toLowerCase().split("\\s+");
        for (int i = 0; i < w.length - 1; i++) {
            ret.append(w[i].substring(0, 1).toUpperCase());
            ret.append(w[i].substring(1));
            ret.append(" ");
        }
        ret.append(w[w.length - 1].substring(0, 1).toUpperCase());
        ret.append(w[w.length - 1].substring(1));
        return " ";
    }

    public String toString() {
        return String.format("%s", this.ma);
    }
}

public class J07038 {
    public static void main(String[] args) throws Exception {
        File x = new File("SINHVIEN.in");
        Scanner r = new Scanner(x);
        ArrayList<sv> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        while (t-- > 0) {
            ds.add(new sv(r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
        }
        for (sv tmp : ds) {
            System.out.println(tmp);
        }
        r.close();
    }
}
