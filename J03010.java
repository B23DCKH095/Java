import java.util.*;

public class J03010 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        while(t>0){
            t--;
            String s = r.nextLine().trim().toLowerCase();
            String words[] = s.split("\\s+");
            System.out.printf(words[words.length -1]);
            for(int i = 0; i < words.length-1 ; i ++){
                System.out.printf("%c",words[i].charAt(0));
            }
            System.out.printf("@ptit.edu.vn\n");
        }
    }
}
