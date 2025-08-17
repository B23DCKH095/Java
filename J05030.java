import java.util.*;
class SV implements Comparable<SV>{
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    public SV(String a,String b,String c,String d,String e,String f){
        this.a = a;
        this.b = b;
        this.c=  c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public int compareTo(SV other){
        return this.a.compareTo(other.a);
    }
    public String toString(){
        String line = String.format("%s %s %s %s %s %s ", a,b,c,d,e,f);
        return line;
    }
}
public class J05030 {
    public static void main(String[] args){
        ArrayList<SV> ds = new ArrayList<>();
        Scanner r = new Scanner(System.in);
        int n = Integer.parseInt(r.nextLine());
        for(int i = 0; i < n ; i++){
            ds.add(new SV(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        for(int i = 0 ; i <n ; i++){
            System.out.printf("%d %s\n",i+1,ds.get(i));
        }
    }
}
