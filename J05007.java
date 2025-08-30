
import java.util.*;

class nv implements Comparable<nv>{
    private String line;
    private String old;
    public nv(int id,String a,String b,String c,String d,String e,String f){
        this.line = String.format("%05d %s %s %s %s %s %s",id,a,b,c,d,e,f);
        this.old = String.format("%s%s%s",c.substring(6),c.substring(0,2),c.substring(4,5));
    }
    public int compareTo(nv other){
        return this.old.compareTo(other.old);
    }
    public String toString(){
        return this.line;
    }
}
public class J05007 {
    public static void main(String[] args){
    Scanner r = new Scanner(System.in);
    int t = Integer.parseInt(r.nextLine());
    ArrayList<nv> ds = new ArrayList<>();
    for(int i = 1; i <= t; i++){
        ds.add(new nv(i,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
    }
    Collections.sort(ds);
    for(nv tmp: ds){
        System.out.println(tmp);
    }
            
    }
}
