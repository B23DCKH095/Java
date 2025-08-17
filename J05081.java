import java.io.File;
import java.util.*;

class SP implements Comparable<SP>{
    private int id;
    private String a;
    private String b;
    private String c;
    private String d;
    private int e;
    public SP(int id,String a,String b ,String c, String d){
        this.id = id;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = Integer.parseInt(d) - Integer.parseInt(c);
    }
    public int compareTo(SP other){
        if (this.e == other.e) return this.id - other.id;
        return other.e - this.e;
    }
    public String toString(){
        String line = String.format("MH%03d %s %s %s %s %d", id,a,b,c,d,e);
        return line;
    }
}
public class J05081{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<SP> ds = new ArrayList<>();
        for(int i = 1; i <= t; i ++){
            ds.add(new SP(i,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(SP tmp: ds){
            System.out.println(tmp);
        }
    }
}