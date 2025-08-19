import java.util.*;

class gv implements Comparable<gv>{
    private String ten;
    private String ma;
    private String mon;
    private String line;
    public gv(int id,String a,String b){
        String words[] = a.split("\\s+");
        this.ten = words[words.length -1];
        this.ma = String.format("GV%02d", id);
        StringBuilder st = new StringBuilder();
        String s[] = b.split("\\s+");
        for(int i = 0 ; i< s.length ; i++){
            st.append(Character.toUpperCase(s[i].charAt(0)));
        }
        this.mon  = st.toString();
        this.line = String.format("%s %s %s",this.ma,a,st.toString());
    }
    public int compareTo(gv other){
        if(this.ten.compareTo(other.ten) == 0) return this.ma.compareTo(other.ma);
        return this.ten.compareTo(other.ten);
    }
    public String toString(){
        return this.line;
    }
    public String get(){
        return this.mon;
    }
}
public class J05026 {
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<gv>ds = new ArrayList<>();
        int id = 1;
        while(t-- > 0){
            ds.add(new gv(id,r.nextLine(),r.nextLine()));
            id += 1;
        }
        int q = Integer.parseInt(r.nextLine());
        while(q-- > 0){
            String b = r.nextLine();
            StringBuilder st = new StringBuilder();
            String s[] = b.split("\\s+");
            for(int i = 0 ; i< s.length ; i++){
            st.append(Character.toUpperCase(s[i].charAt(0)));
            }
            String ok = st.toString();
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n",ok);
            for(gv tmp: ds){
                if(tmp.get().compareTo(ok) == 0) System.out.println(tmp);
            }
        }
    }
}
