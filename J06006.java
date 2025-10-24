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
        return Long.parseLong(this.e) - Long.parseLong(this.d);
    }
    public Long getGiaBan(){
        return Long.parseLong(this.e);
    }

    public String toString() {
        return String.format("%s", this.b);
    }
}

class HD implements Comparable<HD> {
    private String a;
    private String b;
    private String c;
    public Long d;
    private Long e;
    private Long f;

    public HD(int id, String kh, String mh, String sl, Map<String, KH> mpKH, Map<String, MH> mpMH) {
        this.a = String.format("HD%03d", id);
        KH x = mpKH.get(kh);
        this.b = x.toString();
        MH y = mpMH.get(mh);
        this.c = y.toString();
        this.d = Long.parseLong(sl);
        this.e = y.TinhTien() * this.d;
        this.f = y.getGiaBan()*this.d;
    }

    public int compareTo(HD other) {
        return Long.compare(other.e, this.e);
    }

    public String toString() {
        return String.format("%s %s %s %d %d %d", this.a, this.b, this.c, this.d,this.f, this.e);
    }
}

public class J06006 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Map<String, KH> mpKH = new HashMap<>();
        int n = Integer.parseInt(r.nextLine());
        for (int i = 0; i < n; i++) {
            String MaKH = String.format("KH%03d", i + 1);
            mpKH.put(MaKH, new KH(i + 1, r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
        }
        int m = Integer.parseInt(r.nextLine());
        Map<String, MH> mpMH = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String MaMH = String.format("MH%03d", i + 1);
            mpMH.put(MaMH, new MH(i + 1, r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
        }
        ArrayList<HD> ds = new ArrayList<>();
        int q = Integer.parseInt(r.nextLine());
        for (int i = 0; i < q; i++) {
            String[] word = r.nextLine().split("\\s+");
            ds.add(new HD(i + 1, word[0], word[1], word[2], mpKH, mpMH));
        }
        Collections.sort(ds);
        for (HD tmp : ds) {
            System.out.println(tmp);
        }

    }
}
