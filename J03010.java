import java.util.*;

public class J03010 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        Map<String,Integer> mp = new HashMap<>();
        while(t-- >0){
            String name = r.nextLine().toLowerCase();
            StringBuilder ret= new StringBuilder();
            String[] word = name.trim().split("\\s+");
            ret.append(word[word.length-1]);
            for(int i = 0 ; i< word.length - 1; i ++){
                ret.append(word[i].substring(0,1));
            }
            String done = ret.toString();
            if(mp.get(done) == null){
                mp.put(done, 1);
                System.out.printf("%s@ptit.edu.vn\n",done);
            }
            else {
                System.out.printf("%s%d@ptit.edu.vn\n",done,mp.get(done)+1);
                mp.put(done, mp.get(done)+1);
            }
        }
    }
}
