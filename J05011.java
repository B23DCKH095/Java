import java.util.*;

class KH implements Comparable<KH>{
    private String a;
    private String b;
    private int gio;
    private int phut;
    private int t;
    public KH(String a,String b,String c,String d){
        this.a = a;
        this.b = b;
        String vao[] = c.split(":");
        String ra[] = d.split(":");
        int h = Integer.parseInt(ra[0]) - Integer.parseInt(vao[0]);
        int m = Integer.parseInt(ra[1]) - Integer.parseInt(vao[1]);
        int tong = h*60 + m;
        this.gio = (int)(tong/60);
        this.phut = tong%60;
        this.t = tong;
    }
    public int compareTo(KH other){
        return other.t - this.t;
    }
    public String toString(){
        String line = String.format("%s %s %d gio %d phut", a,b,gio , phut);
        return line;
    }
}
public class J05011 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<KH> ds = new ArrayList<>();
        while(t -- > 0){
            ds.add(new KH(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(KH tmp: ds){
            System.out.println(tmp);
        }
    }
}
