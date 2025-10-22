import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class MonHoc implements Comparable<MonHoc>{
    private String MaMon;
    private String TenMon;
    private String HinhThucthi;
    public MonHoc(String Ma,String Ten,String Thi){
        this.MaMon = Ma;
        this.TenMon = Ten;
        this.HinhThucthi = Thi;
    }
    public int compareTo(MonHoc other){
        return this.MaMon.compareTo(other.MaMon);
    }
    @Override
    public String toString(){
        return String.format("%s %s %s", this.MaMon,this.TenMon,this.HinhThucthi);
    }
}
public class J07058 {
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("MONHOC.in");
        Scanner  r =new Scanner(x);
        int t = Integer.parseInt(r.nextLine());
        ArrayList<MonHoc> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new MonHoc(r.nextLine(), r.nextLine(), r.nextLine()));
        }
        Collections.sort(ds);
        for(MonHoc tmp : ds){
            System.out.println(tmp);
        }
    }
}
