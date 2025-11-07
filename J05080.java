import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class sv implements Comparable<sv>{
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
        return this.ten.compareTo(cmp) == 0;
    }
    public int compareTo(sv other){
        int ss = this.ma.compareTo(other.ma);
        if(ss == 0) return Integer.compare(this.nhom, other.nhom);
        return ss;
    }
    public String toString(){
        return String.format("%s %s %02d",this.ma,this.lop,this.nhom);
    }
}

public class J05080 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        Map<String,String> mp = new HashMap<>();
        ArrayList<sv> ds = new ArrayList<>();
        while(t-- > 0){
            String a = r.nextLine();
            String b = r.nextLine();
            String c = r.nextLine();
            String d = r.nextLine();
            if(mp.get(c) == null) mp.put(c,d);
            ds.add(new sv(a,b,c,d));
        }
        Collections.sort(ds);
        t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            String ten = r.nextLine();
            System.out.printf("Danh sach cho giang vien %s:\n",ten);
            for(sv tmp : ds){
                if(tmp.cmp(ten)) System.out.println(tmp);
            }
        }
    }
}
