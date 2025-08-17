import java.util.*;

class SV implements Comparable<SV>{
    private String a;
    private int b;
    private int c;
    public SV(String a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int compareTo(SV other){
        if(this.b == other.b){
            if(this.c == other.c ) return this.a.compareTo(other.a);
            return this.c - other.c;
        }
        return other.b - this.b;
    }
    public String toString(){
        String line = String.format("%s %d %d", a,b,c);
        return line;
    }
}
public class J05042 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        ArrayList<SV> ds = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        for(int i =  0; i < t;  i++){
            String name = r.nextLine();
            String s = r.nextLine();
            String words[] = s.split(" ");
            ds.add(new SV(name, Integer.parseInt(words[0]), Integer.parseInt(words[1])));
        }
        Collections.sort(ds);
        for(SV tmp: ds){
            System.out.println(tmp);
        }
    }
}
