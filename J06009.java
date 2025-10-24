import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class KH {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public KH(int id, String bb, String cc, String dd, String ee) {
        this.a = String.format("KH%03d", id);
        this.b = bb;
        this.c = cc;
        this.d = dd;
        this.e = ee;
    }

    public String toString() {
        return String.format("%s %s", this.b, this.e);
    }
}

class MH {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public MH(int id, String bb, String cc, String dd, String ee) {
        this.a = String.format("MH%03d", id);
        this.b = bb;
        this.c = cc;
        this.d = dd;
        this.e = ee;
    }

    public Long TinhTien() {
        return Long.parseLong(this.e);
    }

    public String toString() {
        return String.format("%s %s %s %s", this.b, this.c, this.d, this.e);
    }
}

class HD {
    private String a;
    private String b;
    private String c;
    public Long d;
    private Long e;

    public HD(int id, String kh, String mh, String sl, Map<String, KH> mpKH, Map<String, MH> mpMH) {
        this.a = String.format("HD%03d", id);
        KH x = mpKH.get(kh);
        this.b = x.toString();
        MH y = mpMH.get(mh);
        this.c = y.toString();
        this.d = Long.parseLong(sl);
        this.e = y.TinhTien() * this.d;
    }

    public String toString() {
        return String.format("%s %s %s %d %d", this.a, this.b, this.c, this.d, this.e);
    }
}

public class J06009 {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("KH.in");
        Scanner r = new Scanner(f1);
        Map<String, KH> mpKH = new HashMap<>();
        int n = Integer.parseInt(r.nextLine());
        for (int i = 0; i < n; i++) {
            String MaKH = String.format("KH%03d", i + 1);
            mpKH.put(MaKH, new KH(i + 1, r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
        }
        File f2 = new File("MH.in");
        r.close();
        r = new Scanner(f2);
        int m = Integer.parseInt(r.nextLine());
        Map<String, MH> mpMH = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String MaMH = String.format("MH%03d", i + 1);
            mpMH.put(MaMH, new MH(i + 1, r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
        }
        File f3 = new File("HD.in");
        r.close();
        r = new Scanner(f3);
        ArrayList<HD> ds = new ArrayList<>();
        int q = Integer.parseInt(r.nextLine());
        for (int i = 0; i < q; i++) {
            String[] word = r.nextLine().split("\\s+");
            ds.add(new HD(i + 1, word[0], word[1], word[2], mpKH, mpMH));
        }
        for (HD tmp : ds) {
            System.out.println(tmp);
        }
        r.close();

    }
}
