import java.util.*;

class nv {
    private String line;
    public nv(int id,String a,String b,String c,String d,String e,String f){
        this.line = String.format("%05d %s %s %s %s %s %s",id,a,b,c,d,e,f);
    }
    public String get(){
        return this.line;
    }
}
public class J05006 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = Integer.parseInt(r.nextLine());
        ArrayList<nv> ds = new ArrayList<>();
        for(int i = 1; i <= n ; i++){
            ds.add(new nv(i,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        for(nv tmp: ds){
            System.out.println(tmp.get());
        }
    }
}
