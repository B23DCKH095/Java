import java.util.*;

class sv implements Comparable<sv>{
    private float diem;
    private String line;
    public sv(String a ,String b,String c, String d,String e){
        String words[] = b.trim().split("\\s+");
        for(int i = 0 ; i< words.length  ; i++) words[i] = formatName(words[i]);
        this.diem = Float.parseFloat(c)*2 + Float.parseFloat(d) + Float.parseFloat(e);
        String kv[] = {"0.5","1","2.5"};
        this.diem += Float.parseFloat(kv[a.charAt(2)-'0'-1]);
        String ok = Float.toString(this.diem);
        if(this.diem == Math.round(this.diem)) ok = ok.substring(0, ok.length() - 2);
        this.line = String.format("%s %s %s %s",a,String.join(" ",words),kv[a.charAt(2)-'0'-1],ok);
    }
    public String formatName(String s){
        StringBuilder st = new StringBuilder();
        s = s.toLowerCase();
        st.append(Character.toUpperCase(s.charAt(0)));
        st.append(s.substring(1));
        return st.toString();
    }
    public int compareTo(sv other){
        if(this.diem == other.diem) return 0;
        if(this.diem > other.diem) return -1;
        return 1;
    }
    public String toString(){
        return this.line;
    }
    public float get(){
        return this.diem;
    }
}
public class J07052 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        int n = t;
        ArrayList<sv> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new sv(r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine(),r.nextLine()));
        }
        
        int q = Integer.parseInt(r.nextLine());
        float diemchuan = 0;
        Collections.sort(ds);
        for(int i = 0 ; i < Math.min(q,n); i ++){
            diemchuan = ds.get(i).get();
        }
        System.out.println(diemchuan);
        for(sv tmp: ds){
            String s = "";
            if(tmp.get() >= diemchuan) s = "TRUNG TUYEN";
            else s = "TRUOT";
            System.out.printf("%s %s\n",tmp,s);
        }
    }
}
