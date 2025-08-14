import java.util.*;

public class J03005 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        while(t>0){
            t--;
            String s = r.nextLine().trim();
            String words[] = s.split("\\s+");
            for(int i = 1 ; i< words.length ; i++){
                words[i] = words[i].toLowerCase();
                char h = Character.toUpperCase(words[i].charAt(0));
                if(i != words.length - 1) System.out.printf("%c%s ",h,words[i].substring(1));
                else System.out.printf("%c%s",h,words[i].substring(1));
            }
            System.out.printf(", %s\n",words[0].toUpperCase());
        }
    }
}
