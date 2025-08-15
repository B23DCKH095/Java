import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07007 {
    public static void main(String[] args){
        File x = new File("VANBAN.in");
        try{
            Scanner r = new Scanner(x);
            Set<String> s = new TreeSet<>();
            while(r.hasNext()){
                String u = r.next().toLowerCase();
                s.add(u);
            }
            for (String string : s) {
                System.out.println(string);
            }
        } catch(FileNotFoundException e){

        }
    }
}
