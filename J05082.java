import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class KH implements Comparable<KH>{
    public String ma;
    public String ten;
    public String gt;
    public String sinh;
    public String dc;
    public KH(int id,String a,String b,String c,String d){
        this.ma = String.format("KH%03d",id);
        String []w1 = a.trim().split("\\s+");
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < w1.length; i++){
            ret.append(w1[i].substring(0,1).toUpperCase());
            ret.append(w1[i].substring(1).toLowerCase());
            ret.append(" ");
        }
        this.ten = ret.toString();
        this.gt = b;
        String []w2 = c.split("\\/");
        this.sinh = String.format("%02d/%02d/%s",Integer.parseInt(w2[0]),Integer.parseInt(w2[1]),w2[2]);
        this.dc = d;
    }
    public int compareTo(KH other){
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        String[] w1= this.sinh.split("\\/");
        String[] w2= other.sinh.split("\\/");
        Integer d1 = Integer.parseInt(w1[2])*100 + Integer.parseInt(w1[1])*10 + Integer.parseInt(w1[0]);
        Integer d2 = Integer.parseInt(w2[2])*100 + Integer.parseInt(w2[1])*10 + Integer.parseInt(w2[0]);
        return Integer.compare(d1, d2);
    }
    public String toString(){
        return String.format("%s %s%s %s %s",this.ma,this.ten,this.gt,this.dc,this.sinh);
    }
}
public class J05082 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<KH> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        int id = 1;
        while(t-- > 0){
            ds.add(new KH(id++,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(KH tmp: ds){
            System.out.println(tmp);
        }
    }
}
