import java.util.*;

class SV implements Comparable<SV> {
    private String ma;
    private String lop;
    private String line;
    public SV(String a,String b ,String c,String d){
        this.ma = a;
        this.lop = c;
        this.line = String.format("%s %s %s %s",a,b,c,d);
    }
    public int compareTo(SV other){
        if(this.lop.compareTo(other.lop) == 0) return this.ma.compareTo(other.ma);
        return this.lop.compareTo(other.lop);
    }
    public String toString(){
        return this.line;
    }
}
public class J05020 {
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        ArrayList<SV> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            ds.add(new SV(r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
        }
        Collections.sort(ds);
        for(SV tmp : ds){
            System.out.println(tmp);
        }
    }
}
