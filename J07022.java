import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07022 {
    public static boolean check(String s){
        if(s.length() > 9) return true;
        for(int i = 0 ;i < s.length() ; i++){
            int x = s.charAt(i) - '0';
            if(!(x >= 0 && x <= 9)) return true;
        }
        return false;
    }
    public static void main(String[] args){
        File x = new File("DATA.in");
        try{
            Scanner r = new Scanner(x);
            ArrayList<String> a = new ArrayList<>();
            while(r.hasNext()){
                String s = r.next();
                if(check(s)) a.add(s);
            }
            a.sort(new Comparator<String>() {
                public int compare(String a,String b){
                    return a.compareTo(b);
                }
            });
            for(int i = 0 ; i< a.size() ; i++){
                System.out.printf("%s ",a.get(i));
            }
            System.out.println("");
        } catch(FileNotFoundException e){

        }
    }    
}
