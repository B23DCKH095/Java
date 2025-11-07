import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J07024 {
    public static void main(String [] args) throws FileNotFoundException{
        File x = new File("DATA1.in");
        Scanner r = new Scanner(x);
        Set<String> s1 = new HashSet<>();
        while(r.hasNext()) s1.add(r.next().toLowerCase());
        r.close();
        File y = new File("DATA2.in");
        r = new Scanner(y);
        Set<String> s2 = new HashSet<>();
        while(r.hasNext()) s2.add(r.next().toLowerCase());
        r.close();
        Set<String> s3 = new TreeSet<>();
        for(String u : s1){
            if(!s2.contains(u)) s3.add(u);
        }
        for(String u : s3) System.out.printf("%s ",u);
        System.out.println("");
        Set<String> s4 = new TreeSet<>();
        for(String u : s2){
            if(!s1.contains(u)) s4.add(u);
        }
        for(String u : s4) System.out.printf("%s ",u);
    }
}
