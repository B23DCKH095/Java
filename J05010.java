import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

class MH implements Comparable<MH> {
    private String line;
    double ln;
    public MH(int id,String a,String b,String c,String d){
        this.ln = Double.parseDouble(d) - Double.parseDouble(c);;
        this.line = String.format("%d %s %s %.2f", id,a,b,this.ln);
    }
    public int compareTo(MH other){
        return (int)(other.ln - this.ln);
    }
    public String toString(){
        return this.line;
    }
}
public class J05010 {
    public static void main(String[] args){
            Scanner r = new Scanner(System.in);
            ArrayList<MH> ds = new ArrayList<>();
            int t= Integer.parseInt(r.nextLine());
            int id = 1;
            while(t-- > 0){
                ds.add(new MH(id, r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
                id ++;
            }
            Collections.sort(ds);
            for(MH tmp : ds){
                System.out.println(tmp);
            }
    }
}
