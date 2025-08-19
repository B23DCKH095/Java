import java.util.*;

class sv implements Comparable<sv>{
    private String ten;
    private String line;
    public sv(String a,String b,String c,String d){
        this.ten = a;
        this.line = String.format("%s %s %s %s",a,b,c,d);
    }
    public int compareTo(sv other){
        return this.ten.compareTo(other.ten);
    }
    public String toString(){
        return this.line;
    }

}
public class J05021 {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        ArrayList<sv> ds = new ArrayList<>();
        while(r.hasNextLine()){
            ds.add(new sv(r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
        }
        Collections.sort(ds);
        int cnt = 1;
        for (sv tmp : ds){
            System.out.println(tmp);
            cnt += 1;
        }
    }
}
