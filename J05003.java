import java.util.*;

class SV{
    private String line;
    public SV(int id,String a,String b ,String c,String d){
        String words[] = c.split("/");
        int ngay = Integer.parseInt(words[0]);
        int thang = Integer.parseInt(words[1]);
        double diem = Double.parseDouble(d);
        this.line = String.format("B20DCCN%03d %s %s %02d/%02d/%s %.2f", id,a,b,ngay,thang,words[2],diem);
    }
    public String get(){
        return this.line;
    }
}
public class J05003 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t= Integer.parseInt(r.nextLine());
        int id = 1;
        while(t -- > 0){
            SV a = new SV(id, r.nextLine(), r.nextLine(), r.nextLine(),r.nextLine());
            id ++;
            System.out.println(a.get());
        }
    }
}
