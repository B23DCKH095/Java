import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class GV implements Comparable<GV>{
    private String name;
    public GV(String name){
        this.name = ChuanHoa(name);
    }
    public String ChuanHoa(String name){
        String[] word = name.toLowerCase().trim().split("\\s+");
        StringBuilder ret = new StringBuilder();
        for(String tmp : word){
            ret.append(tmp.substring(0, 1).toUpperCase());
            ret.append(tmp.substring(1));
            ret.append(" ");
        }
        return ret.toString();
    }
    public int compareTo(GV other){
        String[] w1 = this.name.trim().split("\\s+");
        String[] w2 = other.name.trim().split("\\s+");
        int ss = w1[w1.length-1].compareTo(w2[w2.length-1]);
        if(ss == 0) return this.name.compareTo(other.name);
        return ss; 
    }
    public String toString(){
        return this.name;
    }
}
public class J07072{
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("DANHSACH.in");
        Scanner r= new Scanner(x);
        ArrayList<GV> ds = new ArrayList<>();
        while(r.hasNextLine()){
            ds.add(new GV(r.nextLine()));
        }
        Collections.sort(ds);
        for(GV tmp : ds){
            System.out.println(tmp);
        }
    }
}