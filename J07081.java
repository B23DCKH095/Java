import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SV implements Comparable<SV>{
    private String a;
    private String b;
    private String c;
    private String d;
    public SV(String aa,String bb,String cc,String dd){
        this.a = aa;
        this.b = bb;
        this.c = cc;
        this.d = dd;
    }
    public int compareTo(SV other){
        String[] w1 = this.b.trim().split("\\s+");
        StringBuilder s1 = new StringBuilder();
        String[] w2 = other.b.trim().split("\\s+");
        int ss = w1[w1.length -1 ].compareTo(w2[w2.length - 1]);
        if(ss == 0){
            int ss2 = this.b.compareTo(other.b);
            if(ss2 == 0) return this.a.compareTo(other.a);
            return ss2;
        }
        return ss;
    }
    public String toString(){
        return String.format("%s %s %s %s",this.a,this.b,this.c,this.d);
    }
}

public class J07081 {
    public static void main(String[] args)throws FileNotFoundException{
        File x = new File("SINHVIEN.in");
        Scanner r = new Scanner(x);
        ArrayList<SV> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            ds.add(new SV(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(SV tmp : ds){
            System.out.println(tmp);
        }
    }
}
