import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SV implements Comparable<SV>{
    private String a;
    private String b;
    private String c;
    private String d;
    public SV(String a,String b,String c,String d){
        this.a = a;
        StringBuilder name = new StringBuilder();
        String words[] = b.trim().split("\\s+");
        for(int i = 0 ; i < words.length ; i++){
            words[i] = formatName(words[i]);
            name.append(words[i]);
            name.append(" ");
        }
        this.b = name.toString();
        this.c =c ;
        this.d =d;
        
    }
    public String formatName(String name) {
        if (name == null || name.isEmpty()) return "";
        return Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
    }
    public int compareTo(SV other){
        return this.a.compareTo(other.a);
    }
    public String toString(){
        String line = String.format("%s %s%s %s", a,b,c,d);
        return line;
    }
}
public class J07033 {
    public static void main(String[] args){
        File x = new File("SINHVIEN.in");
        ArrayList<SV> ds = new ArrayList<>();
        try{
            Scanner r= new Scanner(x);
            int t = Integer.parseInt(r.nextLine());
            while(t>0){
                t--;
                ds.add(new SV(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
            }
            Collections.sort(ds);
            for(SV tmp: ds){
                System.out.println(tmp);
            }
        } catch(FileNotFoundException e){
        }
    }
}
