import java.util.*;

class SV{
    private String line;
    private double diem;
    public SV(int a,String b,String c,String d,String e ,String f){
        this.diem = Double.parseDouble(d) + Double.parseDouble(e) + Double.parseDouble(f);
        this.line = String.format("%d %s %s %.1f",a,b,c,this.diem);
    }
    public String getstr(){
        return this.line;
    }
    public double getdiem(){
        return this.diem;
    }
}
public class J05009 {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        int n = Integer.parseInt(r.nextLine());
        ArrayList<SV> ds = new ArrayList<>();
        double tk = 0;
        for(int i = 1; i <= n; i++){
            ds.add(new SV(i, r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine(), r.nextLine()));
            tk = Math.max(ds.get(i-1).getdiem(), tk);
        }
        for(int i = 0; i <n ; i++){
            if(ds.get(i).getdiem() == tk) System.out.println(ds.get(i).getstr());
        }
    }
}
