import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SP implements Comparable<SP>{
    private String a;
    private String b;
    private String c;
    private String d;
    public SP(String a,String b,String c,String d){
        this.a  = a;
        this.b  = b;
        this.c = c;
        this.d = d;
    }
    public int compareTo(SP other){
        int x = Integer.parseInt(this.c);
        int y = Integer.parseInt(other.c);
        if(x==y) return this.a.compareTo(other.a);
        return y-x;
    }
    public String toString(){
        String line = String.format("%s %s %s %s", this.a ,this.b,this.c ,this.d);
        return line;
    }
}
public class J07048 {
    public static void main(String[] args){
        File x = new File("SANPHAM.in");
        try{
            Scanner r = new Scanner(x);
            ArrayList<SP> ds = new ArrayList();
            int t = Integer.parseInt(r.nextLine());
            for(int i = 0 ; i < t ; i++){
                ds.add(new SP(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
            }
            Collections.sort(ds);
            for(SP tmp: ds){
                System.out.println(tmp);
            }
        } catch(FileNotFoundException e){

        }
    }
}
