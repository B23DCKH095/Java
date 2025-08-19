import java.util.*;

class sv{
    private String line;
    private String nam;
    public sv(String a,String b,String c,String d){
        this.nam = a;
        this.line = String.format("%s %s %s %s", a,b,c,d);
    }
    public String get(){
        return this.nam.substring(1, 3);
    }
    public String toString(){
        return this.line;
    }
}
public class J05023 {
    public static void main(String[] args) {
        ArrayList<sv> ds = new ArrayList<>();
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            ds.add(new sv(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        int q = Integer.parseInt(r.nextLine());
        while(q-- > 0){
            String s = r.nextLine();
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n",s);
            for(sv tmp : ds){
                if(tmp.get().compareTo(s.substring(2, 4)) == 0 && s.substring(0,2).compareTo("20") == 0) System.out.println(tmp.toString());
            }
        }
    }
}
