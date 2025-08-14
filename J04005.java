import java.util.*;


public class J04005 {
    public static void main(String[] args){
        Scanner r =new Scanner(System.in);
        String name = r.nextLine();
        String date = r.nextLine();
        double x = Double.parseDouble(r.nextLine());
        double y = Double.parseDouble(r.nextLine());
        double z = Double.parseDouble(r.nextLine());
        double sum = x + y + z;
        System.out.printf("%s %s %.1f",name,date,sum);
    }    
}
