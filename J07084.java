import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

class SV{
    private String Ten;
    private Long ThoiGianOnline;
    public SV(String ten,String NgayVao,String NgayRa){
        this.Ten = ten;
        this.ThoiGianOnline = TinhThoiGianOnline(NgayVao, NgayRa);
    }
    public Long TinhThoiGianOnline(String vao,String ra){
        String pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try{
            Date NgayVao = format.parse(vao);
            Date NgayRa = format.parse(ra);
            return (NgayRa.getTime() - NgayVao.getTime())/60000;
        } catch(ParseException e){
            System.out.println("Not Working!");
            return 0L;
        }
    }
    public Long getThoiGianOnline(){
        return this.ThoiGianOnline;
    }
    public String toString(){
        return String.format("%s %d", this.Ten ,this.ThoiGianOnline);
    }

}
public class J07084 {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("ONLINE.in");
        Scanner r = new Scanner(x);
        ArrayList<SV> ds  = new ArrayList<>();
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            ds.add(new SV(r.nextLine(),r.nextLine(),r.nextLine()));
        }
        Collections.sort(ds,(sv1,sv2) -> Long.compare(sv2.getThoiGianOnline(),sv1.getThoiGianOnline()));
        for(SV tmp: ds){
            System.out.println(tmp);
        }

    }
}
