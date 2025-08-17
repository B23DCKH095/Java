import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class DN implements Comparable<DN>{
    private String a;
    private String b;
    private String c;
    public DN(String a,String b,String c){
        this.a = a;
        this.b = b;
        this.c =c ;
    }
    public int compareTo(DN other){
        return this.a.compareTo(other.a);
    }
    public String toString(){
        String line = String.format("%s %s %s", a,b,c);
        return line;
    }
}
public class J07037 {
    public static void main(String[] args){
        File x = new File("DN.in");
        try{
            ArrayList<DN>ds = new ArrayList<>();
            Scanner r = new Scanner(x);
            int t = Integer.parseInt(r.nextLine());
            while(t>0){
                t--;
                ds.add(new DN(r.nextLine(),r.nextLine(),r.nextLine()));
            }
            Collections.sort(ds);
            for(DN tmp : ds){
                System.out.println(tmp);
            }
        } catch(FileNotFoundException e){
            
        }

    }
}
