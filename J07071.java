import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class GV implements Comparable<GV>{
    private String TenGV;
    public GV(String ten){
        this.TenGV = ten;
    }
    public Boolean check(String cmp){
        String[] w1 = this.TenGV.split("\\s+");
        String[] w2 = cmp.split("\\.");
        // System.out.println(w2.length);
        if(w1.length != w2.length) return false;
        for(int i = 0 ; i < w1.length ; i++){
            // System.out.println(w1[i] + " vs "+ w2[i]);
            if(w2[i].compareTo("*") == 0) continue;
            if(w1[i].substring(0, 1).compareTo(w2[i]) != 0) return false;
        }
        return true;
    }
    public int compareTo(GV other){
        String[] w1 = this.TenGV.split("\\s+");
        String[] w2 = other.TenGV.split("\\s+");
        int ss = w1[w1.length-1].compareTo(w2[w2.length -1 ]);
        if(ss == 0) return w1[0].compareTo(w2[0]);
        return ss;
    }
    public String toString(){
        return this.TenGV;
    }
}
public class J07071 {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("DANHSACH.in");
        Scanner r  = new Scanner(x);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<GV> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new GV(r.nextLine()));
        }
        int q = Integer.parseInt(r.nextLine());
        Collections.sort(ds);
        while(q-- > 0){
            String cmp = r.nextLine();
            for(GV tmp : ds){
                if(tmp.check(cmp)) System.out.println(tmp);
            }
        }
    }
}
