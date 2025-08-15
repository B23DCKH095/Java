import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07021 {
    public static void main(String[] args){
        File x = new File("DATA.in");
        try {
            Scanner r = new Scanner(x);
            while(r.hasNextLine()){
                String s = r.nextLine().trim().toLowerCase();
                if(s.compareTo("end") == 0) continue;
                String words[] = s.split("\\s+");
                for(int i = 0 ;i < words.length ; i++){
                    StringBuilder st = new StringBuilder();
                    st.append(Character.toUpperCase(words[i].charAt(0)));
                    st.append(words[i].substring(1));
                    System.out.printf("%s ",st);
                }
                System.out.println("");
            } 
        } catch(FileNotFoundException e){

        }
    }
}
