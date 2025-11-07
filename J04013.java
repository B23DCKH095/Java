import java.util.Scanner;

public class J04013 {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        String ma = r.nextLine();
        String ten = r.nextLine();
        Double d1 = Double.parseDouble(r.nextLine());
        Double d2 = Double.parseDouble(r.nextLine());
        Double d3 = Double.parseDouble(r.nextLine());
        String kv = ma.substring(2,3);
        Double uutien = 0.0;
        if(kv.equals("1")) uutien = 0.5;
        else if(kv.equals("2")) uutien = 1.0;
        else if(kv.equals("3")) uutien = 2.5;
        Double tong = d1+d1 + d2 + d3 + uutien;
        String trangthai = new String();
        if(tong <24) trangthai = "TRUOT";
        else trangthai = "TRUNG TUYEN";
        String a = uutien.toString();
        if (uutien % 1 == 0) {
        a = String.format("%.0f", uutien); // Là số nguyên (1.0, 2.0)
    } else {
        a = String.format("%.1f", uutien); // Là số lẻ (0.5, 2.5)
    }
        Double c = tong - uutien;
        String d = c.toString();
        if(d.substring(d.length()-1).equals("0")) d = d.substring(0,d.length() -2);
        System.out.printf("%s %s %s %s %s",ma,ten,a,d,trangthai);
    }
}
