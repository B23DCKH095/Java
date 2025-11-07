import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class sv{
    public String ma;
    public String lop;
    public Integer nhom;
    public String ten;
    public sv(String a,String b,String c,String d){
        this.ma = a;
        this.lop = b;
        this.nhom = Integer.parseInt(c);
        this.ten = d;
    }
    public boolean cmp(String cmp){
        return this.ma.compareTo(cmp) == 0;
    }
    public String toString(){
        return String.format("%02d %s",this.nhom,this.ten);
    }
}

public class J05079 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        Map<String,String> mp = new HashMap<>();
        ArrayList<sv> ds = new ArrayList<>();
        while(t-- > 0){
            String a = r.nextLine();
            String b = r.nextLine();
            if(mp.get(a) == null) mp.put(a,b);
            ds.add(new sv(a,b,r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(sv1,sv2) -> Integer.compare(sv1.nhom, sv2.nhom));
        t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            String lop = r.nextLine();
            System.out.printf("Danh sach nhom lop mon %s:\n",mp.get(lop));
            for(sv tmp : ds){
                if(tmp.cmp(lop)) System.out.println(tmp);
            }
        }
    }
}
