import java.util.*;

class sv{
    private String ma;
    private String line;
    private String lop;
    public sv(String a,String b,String c,String d){
        this.ma = a.substring(3, 7);
        this.lop = c;
        this.line = String.format("%s %s %s %s", a,b,c,d);
    }
    public int compare(String s){
        if(s.equals("Ke toan")) return this.ma.compareTo("DCKT");
        if("Cong nghe thong tin".equals(s) && this.lop.charAt(0) != 'E' ) return this.ma.compareTo("DCCN");
        if("An toan thong tin".equals(s) && this.lop.charAt(0) != 'E') return this.ma.compareTo("DCAT");
        if("Vien thong".equals(s)) return this.ma.compareTo("DCVT");
        if("Dien tu".equals(s)) return this.ma.compareTo("DCDT");
        return 1;
    }
    public String toString(){
        return  this.line;
    }
}
public class J05024{
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<sv> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new sv(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        int q = Integer.parseInt(r.nextLine());
        while(q-- > 0){
            String s = r.nextLine();
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n",s.toUpperCase());
            for(sv tmp: ds){
                if(tmp.compare(s) == 0) System.out.println(tmp);
        }
        }

    }
}