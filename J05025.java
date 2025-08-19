import java.util.*;

class gv implements Comparable<gv>{
    private String ten;
    private String ma;
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
        this.line = String.format("%s %s %s",this.ma,a,st.toString());
    }
    public int compareTo(gv other){
        if(this.ten.compareTo(other.ten) == 0) return this.ma.compareTo(other.ma);
        return this.ten.compareTo(other.ten);
    }
    public String toString(){
        return this.line;
    }
}
public class J05025 {
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<gv>ds = new ArrayList<>();
        int id = 1;
        while(t-- > 0){
            ds.add(new gv(id,r.nextLine(),r.nextLine()));
            id += 1;
        }
        Collections.sort(ds);
        for(gv tmp: ds){
            System.out.println(tmp);
        }
    }
}
