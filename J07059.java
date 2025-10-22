import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class CaThi implements Comparable<CaThi>{
    private String MaThi;
    private String NgayThi;
    private String GioThi;
    private String PhongThi;
    public CaThi(int id,String Ngay,String Gio,String Phong){
        this.MaThi = String.format("C%03d", id);
        this.NgayThi = Ngay;
        this.GioThi = Gio;
        this.PhongThi = Phong;
    }
    public String trickLo(String Ngay,String Gio,String Ma){
        String word[] = Ngay.split("/");
        StringBuilder ret = new StringBuilder();
        ret.append(word[2]);
        ret.append(word[1]);
        ret.append(word[0]);
        ret.append(Gio);
        ret.append(Ma);
        return ret.toString();
    }
    public int compareTo(CaThi other){
        String Ca1 = trickLo(this.NgayThi, this.GioThi, this.MaThi);
        String Ca2 = trickLo(other.NgayThi,other.GioThi,other.MaThi);
        return Ca1.compareTo(Ca2);
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %S", this.MaThi,this.NgayThi,this.GioThi,this.PhongThi);
    }
}
public class J07059{
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("CATHI.in");
        Scanner r = new Scanner(x);
        int t=  Integer.parseInt(r.nextLine());
        ArrayList<CaThi> ds  = new ArrayList<>();
        int id = 1;
        while(t--  > 0){
            ds.add(new CaThi(id++, r.nextLine(), r.nextLine(), r.nextLine()));
        }
        Collections.sort(ds);
        for(CaThi tmp : ds){
            System.out.println(tmp);
        }
    }
}