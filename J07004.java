import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07004 {
    public static void main(String[] args){
        File x = new File("DATA.in");
        try {
            Scanner r = new Scanner(x);
            int cnt[] = new int[1001];
            while(r.hasNextInt()){
                try{
                    int a = r.nextInt();
                    cnt[a]++;
                } catch(NumberFormatException e){
                }
            }
            for(int i = 0 ; i< 1001; i ++){
                if(cnt[i]!= 0) System.out.printf("%d %d\n",i,cnt[i]);
            }
        } catch(FileNotFoundException e) {

        }
    }
}
