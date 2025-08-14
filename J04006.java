import java.util.*;

public class J04006 {
    public static String chuanhoa(String s){
        StringBuilder res = new StringBuilder();
        String words[] = s.split("/");
        if(words[0].length() < 2)res.append("0");
        res.append(words[0]);
        res.append("/");
        if(words[1].length() < 2) res.append("0");
        res.append(words[1]);
        res.append("/");
        res.append(words[2]);
        return res.toString();
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        String a = r.nextLine();
        String b = r.nextLine();
        String c = r.nextLine();
        double d = Double.parseDouble(r.nextLine());
        c = chuanhoa(c);
        System.out.printf("B20DCCN001 %s %s %s ",a,b,c);
        System.out.printf("%.2f",d);
    }
}
