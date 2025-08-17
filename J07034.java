import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MH implements Comparable<MH>{
    private String a;
    private String b;
    private String c;
    public MH(String a,String b,String c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int compareTo(MH other){
        return this.b.compareTo(other.b);
    }
    public String toString(){
        String line = String.format("%s %s %s",this.a ,this.b ,this.c);
        return line;
    }
}
public class J07034 {
    public static void main(String[] args){
        File x  = new File("MONHOC.in");
        try{
            Scanner r = new Scanner(x);
            int t = Integer.parseInt(r.nextLine());
            ArrayList<MH> ds = new ArrayList<>();
            for(int i = 0 ; i < t ; i ++){
                ds.add(new MH(r.nextLine(),r.nextLine(),r.nextLine()));
            }
            Collections.sort(ds);
            for(MH tmp: ds){
                System.out.println(tmp);
            }

        } catch(FileNotFoundException e){

        }
    }
}
