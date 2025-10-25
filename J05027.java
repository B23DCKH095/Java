import java.util.*;

class GV{
    private String ma;
    private String ten;
    private String khoa;
    public GV(int id,String ten,String kkhoa){
        this.ma = String.format("GV%02d",id);
        this.ten = ten;
        String[] word = kkhoa.trim().split("\\s+");
        StringBuilder ret = new StringBuilder();
        for(String tmp : word){
            ret.append(tmp.substring(0,1).toUpperCase());
        }
        this.khoa = ret.toString();
    }
    public Boolean check(String tar){
        String target = tar.toLowerCase();
        return this.ten.toLowerCase().con.contains(target);
    }
    public String toString(){
        return String.format("%s %s %s", this.ma,this.ten,this.khoa);
    }
}

public class J05027 {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<GV> ds = new ArrayList<>();
        int id = 1;
        while(t-- > 0){
            ds.add(new GV(id++,r.nextLine(),r.nextLine()));
        }
        int q = Integer.parseInt(r.nextLine());
        while(q-- > 0){
            String tar = r.nextLine();
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n",tar);
            for(GV tmp : ds){
                if(tmp.check(tar)) System.out.println(tmp);
            }
        }
    }
}
