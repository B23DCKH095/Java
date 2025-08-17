import java.lang.reflect.Array;
import java.util.*;

class SV implements Comparable<SV>{
    private String line;
    private double gpa;
    public SV(int id,String a,String b ,String c,String d){
        String name[] = a.trim().split("\\s+");
        for(int i = 0; i < name.length ; i ++){
            name[i] = formatName(name[i].toLowerCase());
        }
        a = String.join(" ", name);
        String words[] = c.split("/");
        int ngay = Integer.parseInt(words[0]);
        int thang = Integer.parseInt(words[1]);
        double diem = Double.parseDouble(d);
        this.gpa = diem;
        this.line = String.format("B20DCCN%03d %s %s %02d/%02d/%s %.2f", id,a,b,ngay,thang,words[2],diem);
    }
    public String get(){
        return this.line;
    }
    public String formatName(String s){
        StringBuilder st = new StringBuilder();
        st.append(Character.toUpperCase(s.charAt(0)));
        st.append(s.substring(1));
        return st.toString();
    }
    public int compareTo(SV other){
        if(other.gpa > this.gpa) return 1;
        else if(other.gpa == this.gpa) return 0;
        return -1;
    }
    public String toString(){
        return this.line;
    }
}
public class J05005 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t= Integer.parseInt(r.nextLine());
        int id = 1;
        ArrayList<SV> ds  = new ArrayList<>();
        while(t -- > 0){
            SV a = new SV(id, r.nextLine(), r.nextLine(), r.nextLine(),r.nextLine());
            id ++;
            ds.add(a);
        }
        Collections.sort(ds);
        for(SV tmp : ds){
            System.out.println(tmp);
        }
    }
}
