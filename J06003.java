import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SV{
    public String nhom;
    public String lop;
    public String ten;
    public String sdt;
    public SV(String a,String b,String c,String d){
        this.lop = a;
        this.ten = b;
        this.sdt = c;
        this.nhom = d;
    }
    public boolean cmp(String other){
        return this.nhom.compareTo(other) == 0;
    }
    public String toString(){
        return String.format("%s %s %s",this.lop ,this.ten,this.sdt);
    }
}
public class J06003 {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        String []w = r.nextLine().split(" ");
        int n = Integer.parseInt(w[0]);
        int q = Integer.parseInt(w[1]);
        ArrayList<SV> ds = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            ds.add(new SV(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Map<String,String> mp = new HashMap<>();
        for(int i = 0 ; i <q ; i++){
            mp.put(String.format("%d", i+1),r.nextLine());
        }
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            String cmp = r.nextLine();
            System.out.printf("DANH SACH NHOM %s:\n",cmp);
            for(SV tmp : ds){
                if(tmp.cmp(cmp)) System.out.println(tmp);
            }
            System.out.printf("Bai tap dang ky: %s\n",mp.get(cmp));
        }
    }
}
