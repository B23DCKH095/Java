import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07018 {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("SINHVIEN.in");
        Scanner r = new Scanner(x);
        int t = Integer.parseInt(r.nextLine());
        int id = 1;
        while (t-- > 0) {
            String ten = r.nextLine().toLowerCase();
            String lop = r.nextLine();
            String sinh = r.nextLine();
            String gpa = r.nextLine();
            String ma = String.format("B20DCCN%03d", id++);

            StringBuilder ret = new StringBuilder();
            String[] w1 = ten.trim().split("\\s+");
            for (String tmp : w1) {
                ret.append(tmp.substring(0, 1).toUpperCase());
                ret.append(tmp.substring(1));
                ret.append(" ");
            }
            ten = ret.toString();
            String[] w2 = sinh.trim().split("\\/");
            sinh = String.format("%02d/%02d/%s", Integer.parseInt(w2[0]), Integer.parseInt(w2[1]), w2[2]);
            gpa = String.format("%.02f", Double.parseDouble(gpa));
            System.out.printf("%s %s%s %s %s\n", ma, ten, lop, sinh, gpa);
        }
    }
}
