import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07078{
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("STRING.in");
        Scanner r = new Scanner(x);
        int t = Integer.parseInt(r.nextLine());
        while(t-- > 0){
            String s1 = r.nextLine();
            String s2 = r.nextLine();
            for(int i = 0 ; i < s1.length() - s2.length() + 1 ; i++){
                String cmp = s1.substring(i, i + s2.length());
                if(cmp.equals(s2)) System.out.printf("%d ",i+1);
            }
            System.out.println("");
        }
    }
}