import java.util.*;

class SV implements Comparable<SV>{
    private String ma;
    private int sl;
    private String line;
    public SV(String a,String b ,String c){
        this.sl = Integer.parseInt(c);
        this.ma = a;
        this.line = String.format("%s %s %s", a,b,c);
    }
    public int compareTo(SV other){
        if(this.sl == other.sl) return this.ma.compareTo(other.ma);
        return other.sl - this.sl;
    }
    public String toString(){
        return this.line;
    }
    public boolean trongkhoang(int a,int b){
        return a <= this.sl && this.sl <=b;
    }
}
public class J05029 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<SV>ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new SV(r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);

        int q = Integer.parseInt(r.nextLine());
        while (q-- > 0) {
            String s[] = r.nextLine().split("\\s+");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %s DEN %s SINH VIEN:\n",a,b);
            for(SV tmp: ds){
                if(tmp.trongkhoang(a,b)) System.out.println(tmp);
        }
        }
    }
}
