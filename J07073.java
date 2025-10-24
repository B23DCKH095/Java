import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class MH{
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Boolean ok;
    public MH(String aa,String bb,String cc,String dd,String ee){
        this.a = aa;
        this.b = bb;
        this.c = cc;
        this.d = dd;
        this.e = ee;
        this.ok = check(ee) || check(dd);
    }
    public String getMa(){
        return this.a;
    }
    public Boolean check(String tmp){
        if(tmp.compareTo("Truc tuyen") == 0) return true;
        if(tmp.length()>= 12){
            String me = tmp.substring(tmp.length() - 12);
            String you = ".ptit.edu.vn";
            if(me.compareTo(you) == 0) return true;
            return false;
        }
        return false;
    }
    public boolean check(){
        return this.ok;
    }
    public String toString(){
        return String.format("%s %s %s %s %s", this.a,this.b,this.c,this.d,this.e);
    }
}
public class J07073 {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("MONHOC.in");
        Scanner r = new Scanner(x);
        ArrayList<MH> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            ds.add(new MH(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(mh1,mh2) -> (mh1.getMa()).compareTo(mh2.getMa()));
        for(MH tmp: ds){
            if(tmp.check()) System.out.println(tmp);
        }
    }
}
