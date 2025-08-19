import java.util.*;

class sv implements Comparable<sv>{
    private String ten;
    private String line;
    public sv(String a,String b,String c,String d,String e,String f){
        float d1 = Float.parseFloat(d);
        float d2 = Float.parseFloat(e);
        float d3 = Float.parseFloat(f);
        this.ten = b;
        this.line = String.format("%s %s %s %.1f %.1f %.1f",a,b,c,d1,d2,d3);
    }
    public int compareTo(sv other){
        return this.ten.compareTo(other.ten);
    }
    public String toString(){
        return this.line;
    }

}
public class J05031 {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        int n = Integer.parseInt(r.nextLine());
        ArrayList<sv> ds = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            ds.add(new sv( r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
        }
        Collections.sort(ds);
        int cnt = 1;
        for (sv tmp : ds){
            System.out.printf("%d %s\n",cnt,tmp);
            cnt += 1;
        }
    }
}
