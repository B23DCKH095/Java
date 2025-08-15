import java.util.*;
public class J04015 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        String a = r.nextLine();
        String b = r.nextLine();
        long c= Long.parseLong(r.nextLine());
        String cv = a.substring(0,2);
        int bac = Integer.parseInt(a.substring(2,a.length()));
        long pc = 0;
        if(cv.equals("HT")) pc = 2000000;
        if(cv.equals("HP")) pc = 900000;
        if(cv.equals("GV")) pc = 500000;
        long luong  = c*bac + pc;
        System.out.printf("%s %s %d %d %d",a,b,bac , pc,luong);
    }
}
