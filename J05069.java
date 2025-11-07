import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class bong{
    public String ma;
    public String ten;
    public Long gia;
    public bong(String a,String b,String c){
        this.ma = a;
        this.ten = b;
        this.gia = Long.parseLong(c);
    }


}
class doi implements Comparable<doi>{
    public String ma;
    public String ten;
    public Long doanhthu;
    public doi(String a,String b,Long c){
        this.ma = a;
        this.ten = b;
        this.doanhthu = c;
    }
    public int compareTo(doi other){
        int ss = Long.compare(other.doanhthu,this.doanhthu);
        if(ss == 0) return this.ten.compareTo(other.ten);
        return ss;
    }
    public String toString(){
        return String.format("%s %s %d",this.ma,this.ten,this.doanhthu);
    }
}
public class J05069 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        Map<String,bong> mp = new HashMap<>();
        while(t--  > 0){
            String a = r.nextLine();
            mp.put(a,new bong(a,r.nextLine(),r.nextLine()));
        }
        t = Integer.parseInt(r.nextLine());
        ArrayList<doi> ds = new ArrayList<>();
        while(t-- > 0){
            String tmp = r.nextLine();
            String []w = tmp.split(" ");
            String ma = w[0].substring(1,3);
            bong u = mp.get(ma);
            Long doanhthu = u.gia*Long.parseLong(w[1]);
            ds.add(new doi(w[0],u.ten,doanhthu));
        }
        Collections.sort(ds);
        for(doi tmp: ds){
            System.out.println(tmp);
        }
    }
}
