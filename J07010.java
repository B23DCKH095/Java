import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07010 {
    public static void main(String[] args){
        File x = new File("SV.in");
        try{
            Scanner r =new Scanner(x);
            int n = Integer.parseInt(r.nextLine());
            for(int i = 1; i <= n ; i++){
                String a = r.nextLine();
                String b = r.nextLine();
                String words[] = r.nextLine().split("/");
                String  c= String.format("%02d/%02d/%s", Integer.parseInt(words[0]),Integer.parseInt(words[1]),words[2]);
                String d = String.format("%.2f", Double.parseDouble(r.nextLine()));
                System.out.printf("B20DCCN%03d %s %s %s %s\n",i,a,b,c,d);
            }
        } catch(FileNotFoundException e){

        }
    }
}
