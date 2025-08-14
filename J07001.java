import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07001 {
    public static void main(String[] args){
        File x = new File("DATA.in");
        try{
            Scanner r = new Scanner(x);
            while(r.hasNextLine()){
                String s = r.nextLine();
                System.out.printf("%s\n",s);
            }

        } catch(FileNotFoundException e){

        }
    }
}