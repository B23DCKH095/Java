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
}
public class J05028 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<SV>ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new SV(r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(SV tmp: ds){
            System.out.println(tmp);
        }
    }
}
