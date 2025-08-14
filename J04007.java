import java.util.Scanner;

public class J04007 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        String name = r.nextLine();
        String sex = r.nextLine();
        String born = r.nextLine();
        String adr = r.nextLine();
        String tax = r.nextLine();
        String date = r.nextLine();
        System.out.printf("00001 %s %s %s %s %s %s",name,sex,born,adr,tax,date);
    }    
}
