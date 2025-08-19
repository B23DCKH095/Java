import java.util.*;

class sv implements Comparable<sv>{
    private String line;
    private String ten;
    private String thuctap;
    public sv(int id,String a,String b,String c,String d,String e){
        this.thuctap = e;
        this.ten  =a;
        this.line = String.format("%d %s %s %s %s %s", id,a,b,c,d,e);
    }
    public int compareTo(sv other){
        return this.ten.compareTo(other.ten);
    }
    public String get(){
        return this.thuctap;
    }
    public String ok(){
        return this.line;
    }
}
public class J05035 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = Integer.parseInt(r.nextLine());
        ArrayList<sv> ds = new ArrayList<>();
        for(int i = 1; i <= n ; i++){
            ds.add(new sv(i,r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds);
        int q = Integer.parseInt(r.nextLine());
        while (q-- > 0) {
            String s = r.nextLine();
            for(sv tmp : ds){
                if(tmp.get().compareTo(s) == 0){
                    System.out.println(tmp.ok());
                }
            }
        }
    }
}
